package com.houseoffourleaf.ecommerce.service;

import com.houseoffourleaf.ecommerce.controller.ImageController;
import com.houseoffourleaf.ecommerce.dto.ImageDTO;
import com.houseoffourleaf.ecommerce.entity.DeviceType;
import com.houseoffourleaf.ecommerce.entity.Image;
import com.houseoffourleaf.ecommerce.entity.Product;
import com.houseoffourleaf.ecommerce.mapper.DeviceTypeMapper;
import com.houseoffourleaf.ecommerce.mapper.ImageMapper;
import com.houseoffourleaf.ecommerce.repository.DeviceTypeRepository;
import com.houseoffourleaf.ecommerce.repository.ImageRepository;
import com.houseoffourleaf.ecommerce.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Logger;
import java.util.stream.Stream;

@Service
public class ImageService {
    private static final Logger log = Logger.getLogger(ImageService.class.getName());

    private final ImageRepository imageRepository;
    private final ProductRepository productRepository;
    private final DeviceTypeRepository deviceTypeRepository;
    private final  AuditService auditService;

    @Autowired
    public ImageService(ImageRepository imageRepository,
                        AuditService auditService,
                        DeviceTypeRepository deviceTypeRepository,
                        ProductRepository productRepository){
        this.imageRepository = imageRepository;
        this.auditService = auditService;
        this.deviceTypeRepository = deviceTypeRepository;
        this.productRepository = productRepository;
    }

    public Image store(MultipartFile file, ImageDTO imageDTO,  String loginUser) throws IOException {
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        Image image = new Image();
        image.setFilename(fileName);
        image.setFormat("jpg");
        image.setData(file.getBytes());
        image.setActiveInd('Y');
        image.setOrder(1);//TODO:: replace logic
        productRepository.findById(imageDTO.getProduct().getId()).ifPresent(image::setProduct);
        deviceTypeRepository.findById(imageDTO.getDevice().getCode()).ifPresent(image::setDevice);
        auditService.setAuditData(image, loginUser);
        return imageRepository.save(image);
    }

    public ImageDTO getImageFileById(String uuid) {

        Optional<Image> imageOptional =imageRepository.findById(UUID.fromString(uuid));
        if(imageOptional.isPresent()){
            Image image = imageOptional.get();
           return  ImageMapper.toDTO(image);
        }
        return new ImageDTO();
    }

    @Transactional
    public Stream<Image> getImagesByProductCode(String productCode) {
        Optional<Product> productOptional = productRepository.findByCode(productCode);
        if(productOptional.isPresent()){
            Product product = productOptional.get();
            return imageRepository.findAllByProduct(product);
        }
        return Stream.empty();
    }

}
