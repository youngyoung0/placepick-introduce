package com.introduce.placepick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroduceController {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }
}
