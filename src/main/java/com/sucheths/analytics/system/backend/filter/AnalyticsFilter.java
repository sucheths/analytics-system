package com.sucheths.analytics.system.backend.filter;

import com.sucheths.analytics.system.backend.exception.AnalyticsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sucheth.shivakumar
 */
public class AnalyticsFilter extends OncePerRequestFilter {
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (AnalyticsException re) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
        }
    }
}
