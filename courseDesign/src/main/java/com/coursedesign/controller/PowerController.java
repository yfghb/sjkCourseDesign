package com.coursedesign.controller;

import com.coursedesign.service.PowerService;
import com.coursedesign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/powers")
public class PowerController {

    @Autowired
    private PowerService powerService;
}
