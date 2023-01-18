package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	//http://localhost:8000/blog/temp/home
	@GetMapping("/temp/home")
	public String tempHome() {
		System.out.println("tempHome()");
		return "/home.html";
	} 

	//http://localhost:8000/blog/temp/jsp
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		return "test";
	}
	
	//http://localhost:8000/blog/temp/img
	@GetMapping("/temp/img")
	public String tempImg() {
		return "/java.jpg";
	} 
	
	

}
