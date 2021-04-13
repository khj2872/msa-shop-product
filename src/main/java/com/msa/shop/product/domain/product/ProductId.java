package com.msa.shop.product.domain.product;

import com.msa.shop.product.util.Util;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@EqualsAndHashCode
public class ProductId implements Serializable {
    @Column(name = "product_id")
    private String value;

    public ProductId() {
        this.value = generateRandomProductId();
    }

    public String generateRandomProductId() {
        return Util.generateRandomId();
    }
}
