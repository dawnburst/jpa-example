package com.dawn.springjpah2.controller;

import com.dawn.springjpah2.service.DptDescriptionImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DptController {

    private DptDescriptionImpl dptDescription;

    public DptController(DptDescriptionImpl dptDescription) {
        this.dptDescription = dptDescription;
    }

    @GetMapping("getDptDescription")
    public String getDptDescription(@RequestParam int statusCode, @RequestParam int languageCode){
        return dptDescription.getDescription(statusCode, languageCode);
    }

}
