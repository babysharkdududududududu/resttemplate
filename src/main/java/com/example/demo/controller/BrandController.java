package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("list-brand")
@RequiredArgsConstructor
public class BrandController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/brand")
    public Object getForObject(){
        String url = "http://localhost:8081/brand";
        return restTemplate.getForObject(url, Object.class);
    }
}
