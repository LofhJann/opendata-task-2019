package com.lofhjann.opendatatask2019.controller;

import com.lofhjann.opendatatask2019.service.SensorDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SensorDataController {

    @Autowired
    private SensorDataService sensorDataService;

    @GetMapping("/sensordata/create")
    public String create() {
        sensorDataService.create();

        return "redirect:/";
    }


}
