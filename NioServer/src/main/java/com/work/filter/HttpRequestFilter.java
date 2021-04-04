package com.work.filter;

import org.apache.http.client.methods.HttpRequestBase;

public interface HttpRequestFilter {
    
    void filter(HttpRequestBase httpRequestBase);
    
}
