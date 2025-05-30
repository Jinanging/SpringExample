	package com.jinanging.spring.ex.mvc;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	
	import com.jinanging.spring.ex.mvc.domain.User;
	import com.jinanging.spring.ex.mvc.service.UserService;
	
	@Controller
	public class UserController {
	
	    @Autowired
	    private UserService userService;
	
	    @RequestMapping("/mvc/user/info")
	    public String userInfo(Model model) {
	        User user = userService.getLastUser();
	        model.addAttribute("title", "가장 최근 등록 사용");
	        model.addAttribute("result", user);
	        return "mvc/userInfo";
	    }
	
	    @PostMapping("/mvc/user/create")
	    public String createUser(
	        @RequestParam("name") String name,
	        @RequestParam("birthday") String birthday,
	        @RequestParam("email") String email,
	        @RequestParam(value = "introduce", required = false) String introduce
	    		,Model model) {
	    	User user = new User();
	    	user.setName(name);
	    	user.setYyyymmdd(birthday);
	    	user.setEmail(email);
	    	user.setIntroduce(introduce);
	    	
	        int count = userService.addUser(user);
	        
	        model.addAttribute("title", "가장 최근 등록 사용");
	        model.addAttribute("result", user);
	        
	        
	        return "redirect:mvc/userInfo";
	    }
	    
	    @GetMapping("/mvc/user/input")
	    public String userInput() {
	    	return "mvc/userInput";
	    }
	}
