package com.hujing.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hujing.ssm.service.SellerInfoService;

@Controller
public class SellerInfoController {
	
	@Autowired
	private SellerInfoService sellerInfoService;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","123");
		return "success";
	} 
	
}
