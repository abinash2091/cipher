package com.springboot.cipher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class cipherController {

	@GetMapping("home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	@GetMapping("gotoCaesarCipher")
	public ModelAndView gotoCaesarCipher() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("caesarCipher");
		return modelAndView;
	}
	
//	public String encryptUsingCaeserCipher() {
//		
//	}
	
	
}
