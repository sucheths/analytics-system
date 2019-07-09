package com.sucheths.analytics.system.backend.controller;

import com.sucheths.analytics.system.backend.exception.AnalyticsException;
import com.sucheths.analytics.system.backend.model.AnalyticsRequest;
import com.sucheths.analytics.system.backend.service.AnalyticsService;
import com.sucheths.analytics.system.backend.utils.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

/**
 * user controller
 * 
 * @author sucheth.shivakumar
 */
@Controller
public class AnalyticsController {
    
    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody AnalyticsRequest request, BindingResult result) throws AnalyticsException {
        
        if(result.hasErrors()){
            throw new AnalyticsException(ErrorCode.INVALID_REQUEST_PARAMETER.getCode(), "Invalid request", "1");
        }

        // create user account
        analyticsService.analyze(request);
        
    }


}

