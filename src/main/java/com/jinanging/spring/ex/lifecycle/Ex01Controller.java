package com.jinanging.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	// 간단한 html response 담는 페이지
	
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/1")
	public String htmlResponse() {
		return ""
				+ "<html>\n"
				+ "		<head><title>Sprint</title></head>\n"
				+ "		<body>\n"
				+ "			<h2>Spring html response</h2>\n"
				+ "		</body>\n"
				+ "</html>";

	}
	
	//앱을 response에 담는 페이지
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String,Integer> mapResponse(){
		// 과일 이름 :가격 key value 구조
		Map<String,Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 4500);
		fruitMap.put("orange", 1300);
		return fruitMap;
	}
	
	

}
