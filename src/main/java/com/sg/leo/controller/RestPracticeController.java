// 
package com.sg.leo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")

public class RestPracticeController {

	@RequestMapping("/hello")
	public String hello() {
		return "return from /hello, RestPracticeController. 10/23 by 김휘일";
	}
	
	//	http://localhost:8080/api/get
	@GetMapping("/get")
	public String get() {
		return "return from /get, RestPracticeController. 10/16 김휘일";
	}
	
	
	//http://localhost:8080/api/getchk/8848
	@GetMapping(value="/getchk/{variable}")
	public String getchk(@PathVariable String variable) { 
	
		return "return from /getchk, RestPracticeController. 10/16 김휘일" + variable;
	}
	

	// http://localhost:8080/api/getparam?name=hjk&email=a@df.com
	@GetMapping(value="/getparam")
	public String getparam(@RequestParam String name, @RequestParam String email) {
		return "/return from /getparm, name = " + name + ", 이메일주소는=" + email;
	}
}