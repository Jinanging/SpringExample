package com.jinanging.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinanging.spring.ex.database.domain.UsedGoods;
import com.jinanging.spring.ex.database.service.UsedGoodsService;

@Controller
public class UsedGoodsController {
	
	@Autowired
	private UsedGoodsService usedGoodsService;
	
	@RequestMapping("db/usedgoods/list")
	@ResponseBody
	public List<UsedGoods> UsedGoodsList() {
		
		// 중고 게시글의 모든 정보 얻어오기
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		return usedGoodsList;
		
		
	}
}
