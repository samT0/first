package com.yc.biz;

import java.util.List;

import com.yc.po.AdminInfo;

public interface IAdminInfoBiz {

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
