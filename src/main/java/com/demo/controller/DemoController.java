package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.UserRepository;
import com.demo.pojo.User;

@RestController
public class DemoController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String index() {
		User user = userRepository.findOne(1);
		System.out.println(user);
		return "success";
	}
}
