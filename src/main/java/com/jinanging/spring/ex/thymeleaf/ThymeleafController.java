package com.jinanging.spring.ex.thymeleaf;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
	
	@GetMapping("/thymeleaf/ex01")
	public String ex01() {
		return "thymeleaf/ex01";
	}
	
	@GetMapping("/thymeleaf/ex02")
	public String ex02(Model model) {
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("바나나");
		
		model.addAttribute("fruitList",fruitList);
		
		List<Map<String,Object>> userList = new ArrayList<>();
		//이름 나이 취미 
		// name 김인규 age : 29 hobby = "독"
		
		Map<String,Object> userMap = new HashMap<>(); 
		userMap.put("name", "김인규");
		userMap.put("age", 29);
		userMap.put("hobby", "독서");
		
		userList.add(userMap);
		
		userMap = new HashMap<>();
		
		userMap.put("name", "바다");
		userMap.put("age", 6);
		userMap.put("hobby", "축구");
		
		userList.add(userMap);
		
		model.addAttribute("userList",userList);
		
		return "thymeleaf/ex02";
	}
	
	@GetMapping("/thymeleaf/ex03")
	public String ex03(Model model) {
		
		Date date = new Date();
		
		LocalDate localDate = LocalDate.now();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		model.addAttribute("date",date);
		model.addAttribute("localDate",localDate);
		model.addAttribute("localDateTime",localDateTime);
		
		
		
		return "thymeleaf/ex03";
		
	}

}
