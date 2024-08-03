package com.houseoffourleaf.ecommerce.controller;

import com.houseoffourleaf.ecommerce.dto.ImageDTO;
import com.houseoffourleaf.ecommerce.exception.ImageUploadException;
import com.houseoffourleaf.ecommerce.response.ImageResponse;
import com.houseoffourleaf.ecommerce.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/images")
public class ImageController {

    private static final Logger log = Logger.getLogger(ImageController.class.getName());

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService){
        this.imageService = imageService;
    }

    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public ResponseEntity<ImageResponse> uploadFile(@RequestParam("file") MultipartFile file, @RequestHeader String loginUser) {
        String message = "";
        try {
            imageService.store(file,null, loginUser);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ImageResponse(file.getName(),null,file.getContentType(), file.getSize(), message));
        } catch (Exception e) {
            log.log(Level.SEVERE, String.format("Could not upload the file:  %s",file.getOriginalFilename()));
            throw new ImageUploadException("Could not upload the file:  "+file.getOriginalFilename());
        }
    }

    @GetMapping("/product/{product-code}")
    public ResponseEntity<List<ImageResponse>> getImagesByProductCode(@PathVariable("product-code") String productCode) {
        List<ImageResponse> files = imageService.getImagesByProductCode(productCode).map(file -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/files/")
                    .path(file.getUuid().toString())
                    .toUriString();

            return new ImageResponse(
                    file.getFilename(),
                    fileDownloadUri,
                    file.getFormat(),
                    file.getData().length,"");
        }).toList();

        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{uuid}")
    public ResponseEntity<byte[]> getFile(@PathVariable String uuid) {
        ImageDTO imageFile = imageService.getImageFileById(uuid);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + imageFile.getFilename() + "\"")
                .body(imageFile.getData());
    }
}
