package com.onlineShopping.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.onlineShopping.exceptions.dto.ExceptionResponse;

public class GlobalExceptionHandler {
	@ExceptionHandler(OnlineShoppingException.class)
    public ResponseEntity<ExceptionResponse> handleKredinbizdeException(OnlineShoppingException exception) {
        //log.error("exception occurred. {0}", exception.getCause());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(prepareExceptionResponse(exception, HttpStatus.NOT_FOUND));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleAllException(Exception exception) {
        //log.error("exception occurred. {0}", exception.getCause());

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(prepareExceptionResponse(exception, HttpStatus.BAD_REQUEST));
    }

    private ExceptionResponse prepareExceptionResponse(Exception exception, HttpStatus httpStatus) {
        return ExceptionResponse.builder()
                .message(exception.getMessage())
                .httpStatus(httpStatus)
                .build();
    }
}
