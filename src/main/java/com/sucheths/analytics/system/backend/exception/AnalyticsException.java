package com.sucheths.analytics.system.backend.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author sucheth.shivakumar
 */
@AllArgsConstructor
@Getter
@Setter
public class AnalyticsException extends RuntimeException {
    
    private String errorCode;
    private String message;
    private String placeCode;
}
