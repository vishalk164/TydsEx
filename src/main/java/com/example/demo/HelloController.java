package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("new")
    public String home() {
        return "Application is running successfull";
    }
    
    @GetMapping
    public String home2() {
		return "Application is run on path new";
    	
    }
}
