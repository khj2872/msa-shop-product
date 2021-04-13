package com.msa.shop.product.application;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CategoryResponse {
    private String categoryId;
    private String name;
    private List<CategoryResponse> children;
}
