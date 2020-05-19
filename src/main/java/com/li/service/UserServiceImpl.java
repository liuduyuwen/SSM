package com.li.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.li.entity.User;
import com.li.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	
	
	@Resource
	private UserMapper userMapper;
	public List<User> userList() {
		System.out.println(userMapper.userList());
		return userMapper.userList();
	}
	
	
}
