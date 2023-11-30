package com.sg.leo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // annotation
public class HelloController {

	@GetMapping("/html")
	public String html() {
		System.out.println("HTML파일이 요청됨");
		return "redirect:myspring.html";
	}
	
	@GetMapping("/img")
	public String img() {
		System.out.println("이미지파일이 요청됨");
		return "redirect:image/apple.jpg";
	}
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("jsp파일이 요청됨");
		model.addAttribute("username", "흐흠 이콘텐츠주인, 김휘일");
		return "hellojsp";
	}
}
