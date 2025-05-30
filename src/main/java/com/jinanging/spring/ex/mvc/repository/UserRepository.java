package com.jinanging.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.jinanging.spring.ex.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public User selectLastUser();
	
	public int insertUser(User user);

}
