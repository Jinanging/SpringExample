package com.jinanging.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jinanging.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// new review 테이블에서 id 가 5인 행 조회
	// -> 전달받은 id와 일치하느 ㄴ행 조회 
	public Review selectReview(@Param("id") int id);

}
