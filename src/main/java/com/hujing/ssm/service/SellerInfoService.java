package com.hujing.ssm.service;


import java.util.List;

import com.hujing.ssm.entity.SellerInfo;

public interface SellerInfoService {

	List <SellerInfo> findAll();
	SellerInfo findOne(String sellerId);
	int insert(SellerInfo sellerInfo);

}
