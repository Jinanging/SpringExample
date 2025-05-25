package com.jinanging.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinanging.spring.ex.mybatis.domain.Review;
import com.jinanging.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// id가 5인 리뷰정보 얻어오기 
	public Review getReview(int id) {
		
		
		//id가 5인 review 테이블 에서 조회 ->아이디와 일치하는 
		Review review = reviewRepository.selectReview(id);
		return review;
		
	}

}
