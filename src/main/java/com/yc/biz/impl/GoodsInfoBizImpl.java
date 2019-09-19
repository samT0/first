package com.yc.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IGoodsInfoBiz;
import com.yc.dao.IGoodsInfoMapper;
import com.yc.po.GoodsInfo;
import com.yc.util.StringUtil;

@Service
public class GoodsInfoBizImpl implements IGoodsInfoBiz{
	@Autowired
	IGoodsInfoMapper mapper;
	
	@Override
	public int add(GoodsInfo gi) {
		if(StringUtil.isNull(gi.getGname(),gi.getPics()+"",gi.getPics())) {
			return -1;
		}
		return mapper.add(gi);
	}

}
