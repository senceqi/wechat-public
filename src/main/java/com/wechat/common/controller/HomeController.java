package com.wechat.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

	@RequestMapping("/main")
	public String indexPage(){
		return "main";
	}

	
}