package com.work.filter;

import org.apache.http.client.methods.HttpRequestBase;

/**
 * @author nhsoft.ll
 */
public class HeadHttpServerRequestFilter implements HttpRequestFilter{

    @Override
    public void filter(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("xjava", "lul");
    }
}
