package com.yc.biz;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.AdminInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class AdminInfoBizTest {
	@Autowired
	IAdminInfoBiz adminInfobiz;
	
	@Test
	public void testLogin() {
		AdminInfo ai=new AdminInfo();
		ai.setAname("sam");
		ai.setPwd("a");
		System.out.println(adminInfobiz.login(ai));
	}
	
	@Test
	public void testFindAll() {
		System.out.println(adminInfobiz.findAll());
	}
	
	@Test
	public void testAdd() {
		AdminInfo ai=new AdminInfo();
		ai.setAname("limei");
		ai.setPwd("a");
		ai.setTel("12295887423");
		System.out.println(adminInfobiz.add(ai));
	}
	
	@Test
	public void testUpdatePwd() {
		System.out.println(adminInfobiz.updatePwd(2));
	}
	

}
