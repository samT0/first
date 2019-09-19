package com.yc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yc.po.AdminInfo;

public interface IAdminInfoMapper {
	
	/**
	 * ��Ӻ�̨������Ϣ
	 * @return
	 */
	public int add(AdminInfo ai);
	
	/**
	 * ��Ӻ�̨������Ϣ
	 * @param ai
	 * @return
	 */
	public AdminInfo login(AdminInfo ai);
	
	/**
	 * ��ѯ����
	 */
	public List<AdminInfo> findAll();
	
	/**
	 * �������� 
	 * @param id
	 * @return
	 */
	public int updatePwd(Integer id);
}
