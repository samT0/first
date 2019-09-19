package com.yc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IAdminInfoBiz;
import com.yc.po.AdminInfo;

@Controller
@RequestMapping("/back")
public class AdminInfoController {
	@Autowired
	private IAdminInfoBiz biz;
	
	@RequestMapping("/login")
	@ResponseBody
	public int login(AdminInfo ai,HttpSession session) {
		AdminInfo info=biz.login(ai);
		if(null!=info) {
			session.setAttribute("admin", info);
			return 1;
		}
		return 0;
	}
	
	@RequestMapping("/admin/findAll")
	@ResponseBody
	public List<AdminInfo> findAll() {
		return biz.findAll();
	}
	
	@RequestMapping("/admin/add")
	@ResponseBody
	public int add(AdminInfo ai) {
		return biz.add(ai);
	}
	
	@RequestMapping("/admin/update")
	@ResponseBody
	public int update(Integer id) {
		return biz.updatePwd(id);
	}
	
	@RequestMapping("/manager")
	public String loginSuccess(HttpSession session) {
//		System.out.println(session.getAttribute("admin")==null);
//		System.out.println(session.getAttribute("admin")+".....2");
		return "index";
	}
	
}
