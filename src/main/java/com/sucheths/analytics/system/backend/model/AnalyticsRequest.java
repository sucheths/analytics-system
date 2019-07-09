package com.sucheths.analytics.system.backend.model;

import lombok.Getter;
import lombok.Setter;

/**
 *  model for analytics request
 *  
 * @author sucheth.shivakumar
 */
@Getter
@Setter
public class AnalyticsRequest {
    
    private String appCode;
    private String pageId;
    private String userAgent;
    private String ipAddress;
    
}
