package com.msa.shop.product.domain.category;

import com.msa.shop.product.util.Util;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
@Getter
@EqualsAndHashCode
public class CategoryId implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private String value;

    public CategoryId() {
        this.value = Util.generateRandomId();
    }
}
