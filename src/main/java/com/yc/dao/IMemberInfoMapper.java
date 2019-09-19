package com.yc.dao;

import com.yc.po.MemberInfo;

public interface IMemberInfoMapper {
	
	public MemberInfo add(MemberInfo mi);
	
	public MemberInfo login(MemberInfo mi);
}
