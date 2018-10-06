package com.hujing.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hujing.ssm.dao.SellerInfoMapper;
import com.hujing.ssm.entity.SellerInfo;
import com.hujing.ssm.service.SellerInfoService;

@Service
public class SellerInfoServiceImpl implements SellerInfoService {
	
	@Autowired
	private SellerInfoMapper SellerInfoMapper;
	@Override
	public List<SellerInfo> findAll() {
		return SellerInfoMapper.findAll();
	}

	@Override
	public SellerInfo findOne(String sellerId) {
		return SellerInfoMapper.findOne(sellerId);
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public int insert(SellerInfo sellerInfo) {
		int result = SellerInfoMapper.insert(sellerInfo);
		return result;
	}

}
