package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.UserService;

@CrossOrigin
@RestController
public class MainController {
	@Autowired
	UserService service;

		@RequestMapping("/test")
		public String test() {
			return "hi ";
			
		}
}
