package com.msa.shop.product.domain.category;

import com.msa.shop.product.domain.product.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseTimeEntity {
    @EmbeddedId
    private CategoryId id;

    @Column(name = "name", unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> children;

    public Category(CategoryId id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(CategoryId id, String name, Category parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }
}
