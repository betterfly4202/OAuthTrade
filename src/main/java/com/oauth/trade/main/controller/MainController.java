package com.oauth.trade.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by betterFLY on 2017-11-22.
 */

@Controller
@RequestMapping("/private")
public class MainController {

    @RequestMapping(value = "/main")
    public String homeMain(){
        return "test/test";
    }
}
