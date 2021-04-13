package com.msa.shop.product.application;

import com.msa.shop.product.domain.category.CategoryId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CategoryRequest {
    private String name;
    private CategoryId parent;
}
