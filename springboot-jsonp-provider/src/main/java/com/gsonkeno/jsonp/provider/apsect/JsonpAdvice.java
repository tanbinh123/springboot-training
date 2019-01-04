package com.gsonkeno.jsonp.provider.apsect;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@RestControllerAdvice("com.gsonkeno.jsonp.provider.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {
    public JsonpAdvice() {
        super("callback","jsonp");
    }
}
