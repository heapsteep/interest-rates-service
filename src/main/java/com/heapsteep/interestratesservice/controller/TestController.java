package com.heapsteep.interestratesservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.heapsteep.interestratesservice.bean.InterestRates;

@RestController
@RefreshScope
public class TestController {
	
	@Value("${interest.home}")
    private String home;
	
	@Value("${interest.motor}")
    private String motor;
		
	
	@GetMapping("/getRates") 
    @ResponseBody
    public InterestRates getRates() {
        return new InterestRates(Integer.parseInt(home),Integer.parseInt(motor));
    }
	
	@GetMapping("/getRate_home") 
    @ResponseBody
    public String getRate_home() {
        try {
            return this.home.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }

}
