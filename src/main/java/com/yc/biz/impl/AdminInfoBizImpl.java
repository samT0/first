package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IAdminInfoBiz;
import com.yc.dao.IAdminInfoMapper;
import com.yc.po.AdminInfo;
import com.yc.util.StringUtil;

@Service
public class AdminInfoBizImpl implements IAdminInfoBiz{
	@Autowired
	IAdminInfoMapper mapper;
	
	@Override
	public int add(AdminInfo ai) {
		if(StringUtil.isNull(ai.getAname(),ai.getPwd(),ai.getTel())) {
			return -1;
		}
		return mapper.add(ai);
	}

	@Override
	public AdminInfo login(AdminInfo ai) {
		if(StringUtil.isNull(ai.getAname(),ai.getPwd())) {
			return null;
		}
		return mapper.login(ai);
	}

	@Override
	public List<AdminInfo> findAll() {
		return mapper.findAll();
	}

	@Override
	public int updatePwd(Integer id) {
		if(null==id) {
			return -1;
		}
		return mapper.updatePwd(id);
	}

}
