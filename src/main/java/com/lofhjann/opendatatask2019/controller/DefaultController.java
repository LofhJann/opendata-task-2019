package com.lofhjann.opendatatask2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;


@Controller
@Transactional
public class DefaultController {

    @GetMapping("*")
    @ResponseBody
    public String error() {


        return "404 - Page not found";
    }

    @GetMapping("/")
    public String home() {
        return "/index.html";
    }
}

