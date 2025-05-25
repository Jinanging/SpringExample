package com.jinanging.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinanging.spring.ex.database.domain.UsedGoods;
import com.jinanging.spring.ex.database.repository.usedGoodsRepository;

@Service
public class UsedGoodsService {
	
	//의존성 주입 - DI
	// 객체생성을 Spring Framework 에서 직접 관리 -spring framework  특징 
	@Autowired
	public usedGoodsRepository usedGoodsRepository;
	// 중고 물품 게시글 얻어오기 
	
	public List<UsedGoods> getUsedGoodsList() {
		
		// used_goods 테이블 모든 행 조회
		
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		
		return usedGoodsList;
		
		
	}

}
