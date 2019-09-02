package com.vrain.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="payManager")
public class PayManager {
	
	@RequestMapping(value="pay")
	public Map<String, Object> pay(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		System.out.println("访问了/payManager/pay!");
		
		return resultMap;
	}
	
}
