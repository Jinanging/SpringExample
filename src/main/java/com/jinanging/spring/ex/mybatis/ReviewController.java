package com.jinanging.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinanging.spring.ex.mybatis.domain.Review;
import com.jinanging.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	// id 가 ;5인 리뷰 정보를 response한다 json 으로 담는다
	
	
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("/mybatis/review")
	@ResponseBody
	public Review review(@RequestParam("id")int id) {
		
		// request parameter 로 `id`를 전달 받는다 
		//String idString = request.getParameter("id");
		
		
		
		// 전달받은 id와 일치하게 리뷰정보 얻어오기 
		Review review = reviewService.getReview(id);
		return review;
		
	}
	
	

}
