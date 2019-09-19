package com.yc.biz;


import com.yc.po.GoodsInfo;

public interface IGoodsInfoBiz {
	
	/**
	 * 添加商品信息
	 * @param gi
	 * @return
	 */
	public int add(GoodsInfo gi);
	
}
