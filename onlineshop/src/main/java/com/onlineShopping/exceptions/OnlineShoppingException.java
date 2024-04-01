package com.onlineShopping.exceptions;

public class OnlineShoppingException extends RuntimeException {

    private String message;

    public OnlineShoppingException(String message) {
        super(message);
        this.message = message;
    }
}
