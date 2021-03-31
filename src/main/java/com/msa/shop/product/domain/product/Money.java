package com.msa.shop.product.domain.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Money {
    @Column(name = "price")
    private int value;

    public Money multiply(int multiplier) {
        return new Money(multiplier * value);
    }

}
