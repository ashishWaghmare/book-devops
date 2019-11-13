package com.example.demo.controller;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() throws UnknownHostException {
    InetAddress localHost = InetAddress.getLocalHost();
    return "Hello from machine:" + localHost;
  }

}
