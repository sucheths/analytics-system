package com.sucheths.analytics.system.backend.utils;

/** 
 * error codes enum class
 * 
 * @author sucheth.shivakumar
 */
public enum ErrorCode {
    INVALID_REQUEST_PARAMETER("invalid_request_parameter"),
    NOT_FOUND("not_found");
    
    private String code;

    private ErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
