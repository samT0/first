package com.yc.dao;

import java.util.List;

import com.yc.po.GoodsType;

public interface IGoodsTypeMapper {
	
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
