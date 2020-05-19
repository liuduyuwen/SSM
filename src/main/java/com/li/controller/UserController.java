package com.li.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.li.service.UserService;
import com.li.service.UserServiceImpl;

@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String test(){
//		UserService userService = new UserServiceImpl();
		userService.userList();
		System.out.println("-------------------测试");
		return "SSM 你好";
	}
	
	
	
	@RequestMapping(value="/user")
	public String userView(Map< String, Object> map){
		
		
		System.out.println("用户列表");
		map.put("user", userService.userList().toString());
		return "user";
	}
}
