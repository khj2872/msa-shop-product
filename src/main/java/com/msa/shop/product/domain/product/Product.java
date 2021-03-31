package com.msa.shop.product.domain.product;

import com.msa.shop.product.domain.category.Category;
import com.msa.shop.product.model.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Product extends BaseTimeEntity {
    @EmbeddedId
    private ProductId id;

    private String name;

    @Embedded
    private Money price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    private String detail;

    private long stock;

    private double savingRate;

}