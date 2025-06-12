package com.jinanging.spring.ex.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinanging.spring.ex.mvc.domain.User;
import com.jinanging.spring.ex.mvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//가장 최근에 등록한 사용자 정보 얻오오기 
	
	public User getLastUser() {
		
		User user = userRepository.selectLastUser();
		
		return user;
		
		
	}
	
	public int addUser(User user) {
		int count = userRepository.insertUser(user);
		return count;
	}
	
	// 전달 받은 email이 중복된 것인지 판별
	
	// select where 로 조건 하고 count 만 하면된다....
//	public boolean isDuplicateEamil(String email) {
//		
//	}

}
