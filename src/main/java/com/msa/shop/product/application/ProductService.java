package com.msa.shop.product.application;

import com.msa.shop.product.domain.category.Category;
import com.msa.shop.product.domain.category.CategoryRepository;
import com.msa.shop.product.domain.product.Product;
import com.msa.shop.product.domain.product.ProductId;
import com.msa.shop.product.domain.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductId createProduct(ProductRequest productRequest) {
        Category category = categoryRepository
                .findById(productRequest.getCategory().getId())
                .orElseThrow(() -> new NoProductCategoryException(productRequest.getCategory().getId().getValue()));

        Product product = new Product(
                new ProductId(),
                productRequest.getName(),
                productRequest.getPrice(),
                category,
                productRequest.getDetail(),
                productRequest.getStock(),
                productRequest.getSavingRate());

        return productRepository.save(product).getId();
    }
}
