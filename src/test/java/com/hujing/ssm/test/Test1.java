package com.hujing.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hujing.ssm.entity.SellerInfo;
import com.hujing.ssm.service.SellerInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-*.xml")
public class Test1 {

	@Autowired
	private SellerInfoService SellerInfoService;
	
	@Test
	public void findAllTest(){
		List<SellerInfo> sellerInfos = SellerInfoService.findAll();	
		for (SellerInfo sellerInfo : sellerInfos) {
			System.out.println(sellerInfo);
		}
	}
	@Test
	public void insertTest(){
		SellerInfo sellerInfo = new SellerInfo();
		sellerInfo.setSellerId("2313123").setPassword("123").
		setUsername("hujing").setOpenid("123123");
		System.out.println(sellerInfo);
		SellerInfoService.insert(sellerInfo);
		findAllTest();
	}
}
