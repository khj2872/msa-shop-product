package com.msa.shop.product.application;

public class NoProductCategoryException extends RuntimeException {
    public NoProductCategoryException(String categoryId) {
        super("Cannot find product's categoryId. CategoryId is " + categoryId);
    }
}
