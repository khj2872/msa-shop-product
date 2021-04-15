package com.msa.shop.product.application;

import com.msa.shop.product.domain.category.CategoryId;
import com.msa.shop.product.domain.product.Money;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductRequest {
    private String name;
    private Money price;
    private CategoryId categoryId;
    private String detail;
    private long stock;
    private double savingRate;
}
