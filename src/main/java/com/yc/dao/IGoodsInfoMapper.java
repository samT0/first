package com.yc.dao;


import com.yc.po.GoodsInfo;

public interface IGoodsInfoMapper {
	
	/**
	 * 添加商品信息
	 * @param gi
	 * @return
	 */
	public int add(GoodsInfo gi);
	
}
