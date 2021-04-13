package com.msa.shop.product.api;

import com.msa.shop.product.application.CategoryRequest;
import com.msa.shop.product.application.CategoryService;
import com.msa.shop.product.application.NoParentCategoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public String category(@RequestBody CategoryRequest categoryRequest) {
        return categoryService.createCategory(categoryRequest).getValue();
    }

//    @GetMapping("/{id}")
//    public List<CategoryResponse> getCategories(@PathVariable String id) {
//
//    }

    @ExceptionHandler(NoParentCategoryException.class)
    public String handleNoParentCategory(Exception e) {
        return e.getMessage();
    }
}
