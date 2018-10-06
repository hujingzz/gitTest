package com.hujing.ssm.entity;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class SellerInfo {
	
	private String sellerId;
	private String username;
	private String password;
	private String openid;
	private Date createTime;
	private Date updateTime;
	
	
}
