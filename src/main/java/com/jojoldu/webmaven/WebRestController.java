package com.jojoldu.webmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @GetMapping("/hellom")
    public String hello () {
        return "HellowWorld";
    }
}
