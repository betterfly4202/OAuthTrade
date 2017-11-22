package com.oauth.trade.main.controller;

/**
 * Created by betterFLY on 2017-11-22.
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OAuthController {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/private")
    public String privateArea(){
        return "Private area";
    }


}
