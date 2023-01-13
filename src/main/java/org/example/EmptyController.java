package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmptyController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
