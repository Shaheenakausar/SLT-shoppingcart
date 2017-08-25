package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String indexdemo() {

		return "index";

	}

	@RequestMapping("/home")
	public String homepage() {
		return "home";

	}

	@RequestMapping("/login")
	public String loginpage() {

		return "login";

	}

	@RequestMapping("/signup")
	public String signup() {

		return "signup";

	}

	@RequestMapping("/footer")
	public String footer() {

		return "signup";

	}
}
