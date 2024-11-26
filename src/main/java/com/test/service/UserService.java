package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.Dao;

@Service
public class UserService {
	@Autowired
	Dao dao;
}
