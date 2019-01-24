package com.expertmedics.jwtauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestRestAPI {

  @GetMapping("/hi")
  public String sayHello(){
    return  "Hello World!";
  }
}
