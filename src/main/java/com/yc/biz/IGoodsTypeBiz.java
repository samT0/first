package com.yc.biz;

import java.util.List;

import com.yc.po.GoodsType;

public interface IGoodsTypeBiz {
	/**
	 * ��ѯ����
	 * @return
	 */
	public List<GoodsType> findAll();
	
	/**
	    * ��ѯ����
	 * @return
	 */
	public List<GoodsType> finds();
}
