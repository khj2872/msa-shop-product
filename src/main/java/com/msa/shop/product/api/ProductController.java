package com.msa.shop.product.api;

import com.msa.shop.product.application.ProductRequest;
import com.msa.shop.product.application.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    @PostMapping
    public String product(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest).getValue();
    }
}
