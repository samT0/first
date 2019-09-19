package com.yc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.po.AdminInfo;

public interface IAdminInfoMapper {
	
	/**
	 * 添加后台管理信息
	 * @return
	 */
	public int add(AdminInfo ai);
	
	/**
	 * 添加后台管理信息
	 * @param ai
	 * @return
	 */
	public AdminInfo login(AdminInfo ai);
	
	/**
	 * 查询所有
	 */
	public List<AdminInfo> findAll();
	
	/**
	 * 重置密码 
	 * @param id
	 * @return
	 */
	public int updatePwd(Integer id);
}
