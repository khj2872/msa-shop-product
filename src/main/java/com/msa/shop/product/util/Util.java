package com.msa.shop.product.util;

import java.util.UUID;

public class Util {
    public static String generateRandomId() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
