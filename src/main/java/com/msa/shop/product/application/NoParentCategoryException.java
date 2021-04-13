package com.msa.shop.product.application;

public class NoParentCategoryException extends RuntimeException {
    public NoParentCategoryException(String categoryId) {
        super("Cannot find parent's categoryId. CategoryId is " + categoryId);
    }
}
