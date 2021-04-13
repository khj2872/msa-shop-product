package com.msa.shop.product.application;

import com.msa.shop.product.domain.category.Category;
import com.msa.shop.product.domain.category.CategoryId;
import com.msa.shop.product.domain.category.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryId createCategory(CategoryRequest categoryRequest) {
        Category category;
        if (isNullOrBlank(categoryRequest.getParent())) {
            Category parent = categoryRepository
                    .findById(categoryRequest.getParent())
                    .orElseThrow(() -> new NoParentCategoryException(categoryRequest.getParent().getValue()));
            category = new Category(new CategoryId(), categoryRequest.getName(), parent);

        } else {
            category = new Category(new CategoryId(), categoryRequest.getName());
        }
        return categoryRepository.save(category).getId();
    }

    private boolean isNullOrBlank(Object o) {
        return o == null || o == "";
    }
}
