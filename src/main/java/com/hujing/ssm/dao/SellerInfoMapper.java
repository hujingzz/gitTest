package com.hujing.ssm.dao;

import java.util.List;

import com.hujing.ssm.entity.SellerInfo;

/**
 * 卖家信息接口
 * 
 * @author Administrator
 *
 */

public interface SellerInfoMapper {

	List <SellerInfo> findAll();
	SellerInfo findOne(String sellerId);
	int insert(SellerInfo sellerInfo);
}
