package com.yc.biz;

import java.util.List;

import com.yc.po.AdminInfo;

public interface IAdminInfoBiz {

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
