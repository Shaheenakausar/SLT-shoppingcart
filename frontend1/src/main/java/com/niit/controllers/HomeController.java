package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public String signuppage() {

		return "signup";

	}

	@RequestMapping("/contact")
	public String contactpage() {

		return "contact";

	}

	@RequestMapping("/header")
	public String headerpage() {

		return "header";

	}

	@RequestMapping("/productlist")
	public String productpage() {

		return "productlist";

	}
	@RequestMapping("/log")
	public String logpage() {

		return "log";

	}
	@RequestMapping("/Cart")
	public String Cart() {
		return "Cart";
	}
	@RequestMapping("/AboutUs")
	public String abotuspage() {
		return "AboutUs";
	}
}
