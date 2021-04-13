package com.msa.shop.product.application;

import com.msa.shop.product.domain.category.Category;
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
    private Category category;
    private String detail;
    private long stock;
    private double savingRate;
}
