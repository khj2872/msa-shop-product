package com.msa.shop.product.domain.product;

public class NotEnoughStockException extends RuntimeException {
    public NotEnoughStockException(String productId) {
        super("need more stock. ProductId is " + productId);
    }
}
