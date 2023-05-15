package com.study.test.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/attendanceManage")
	public String attendanceManage() {
		
		return "attendanceManage";
	}
}
