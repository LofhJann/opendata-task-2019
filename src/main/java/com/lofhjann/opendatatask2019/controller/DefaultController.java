package com.lofhjann.opendatatask2019.controller;

import com.lofhjann.opendatatask2019.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;


@Controller
@Transactional
public class DefaultController {

    @Autowired
    private SensorDataService sensorDataService;

    @GetMapping("*")
    @ResponseBody
    public String error() {
        return "404 - Page not found";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("sensordata", sensorDataService.getAll());
        return "index";
    }

    @GetMapping("/history")
    public String history(Model model) {
        model.addAttribute("sensordata", sensorDataService.getAll());
        return "history";
    }
}

