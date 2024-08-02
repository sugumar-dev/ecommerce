package com.houseoffourleaf.ecommerce.service;

import com.houseoffourleaf.ecommerce.dto.ProductDTO;
import com.houseoffourleaf.ecommerce.dto.ProductMaterialDTO;
import com.houseoffourleaf.ecommerce.entity.Audit;
import com.houseoffourleaf.ecommerce.entity.Product;
import com.houseoffourleaf.ecommerce.entity.ProductMaterial;
import com.houseoffourleaf.ecommerce.mapper.ProductMapper;
import com.houseoffourleaf.ecommerce.mapper.ProductMaterialMapper;
import com.houseoffourleaf.ecommerce.repository.ProductMaterialRepository;
import com.houseoffourleaf.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMaterialRepository productMaterialRepository;

    public ProductMaterialDTO getProductMaterialDetails(String code){
        Optional<ProductMaterial> productMaterial = productMaterialRepository.findById(code);
        return productMaterial.map(ProductMaterialMapper::toDTO).orElse(null);
    }
    public List<ProductDTO> fetchAllActiveProductDetails() {
        List<Product> productList  = productRepository.findAllByActiveIndicator('Y');

        return productList.stream().map(ProductMapper::toDto).collect(Collectors.toList());
    }

    public Boolean inactivateProductCode(String productCode, String loginUser) {
        Optional<Product> productOptional = productRepository.findByCode(productCode);
        if(productOptional.isPresent() && productOptional.get().getActiveIndicator() == 'Y'){
            Product product = productOptional.get();
            product.setActiveIndicator('N');
            setUpdateAudit(product, loginUser);
            productRepository.save(product);
            return true;
        }
       return false;
    }

    private void setAuditData(Audit audit, String loginUser) {
        setCreateAudit(audit, loginUser);
        setUpdateAudit(audit, loginUser);
    }

    public void setCreateAudit(Audit audit, String loginUser) {
        audit.setInsertUser(loginUser);
        audit.setInsertTimestamp(LocalDateTime.now());
    }

    public void setUpdateAudit(Audit audit, String loginUser) {
        audit.setUpdateUser(loginUser);
        audit.setUpdateTimestamp(LocalDateTime.now());
    }

    public Boolean activateProductCode(String productCode, String loginUser) {
        Optional<Product> productOptional = productRepository.findByCode(productCode);
        if(productOptional.isPresent() && productOptional.get().getActiveIndicator() == 'N'){
            Product product = productOptional.get();
            product.setActiveIndicator('Y');
            setUpdateAudit(product, loginUser);
            productRepository.save(product);
            return true;
        }
        return false;
    }

    public Boolean updateProduct(ProductDTO productDTO, String productCode, String loginUser) {
        return false;
    }
}
