package com.jinanging.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinanging.spring.ex.mvc.domain.User;
import com.jinanging.spring.ex.mvc.service.UserService;

@Controller
@RequestMapping("/ajax/user")
public class NewUserController {
	
	@Autowired
	private UserService userService;
	
	
	// 사용자 추가 API
	
	// urlmapping
	@ResponseBody
	@PostMapping("/create")
	public Map<String,String> createUser(
			@RequestParam("name") String name
			,@RequestParam("birthday") String birthday
			,@RequestParam("email") String email
			,@RequestParam("introduce") String introduce) {
		
		User user = new User();
		user.setName(name);
		user.setYyyymmdd(birthday);
		user.setEmail(email);
		user.setIntroduce(introduce);
		
		int count = userService.addUser(user);
		
		Map<String,String> resultMap = new HashMap<>();
		
		// 성공했을때{result:"success"}
		
		if(count == 1) {
			resultMap.put("result", "success");
		}
		else {
			resultMap.put("result", "fail");
		}
			
		
		
		return resultMap;
		// 실패 {result:"fail"};
		
	}
	
	
	// 입력 화면 view
	@GetMapping("/input")
	public String inputUser() {
		
		
		return "/ajax/input";
		
	}
	
	//email을 입력받고 중복된 이메일이 있는지 알려주는 API
	@ResponseBody
	@GetMapping("/duplicate-email")
	public isDuplicateEmail(@RequestParam("email") String email){
		
		
	}
	
	
	

}
