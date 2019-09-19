package com.yc.po;

/**
 * 管理员信息实体
 * @author 懿汝
 *
 */
public class AdminInfo {
	private Integer aid;//管理员编号
	private String aname;//管理员名
	private String pwd;//密码
	private String tel;//电话
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public AdminInfo(Integer aid, String aname, String pwd, String tel) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.pwd = pwd;
		this.tel = tel;
	}
	public AdminInfo() {
		super();
	}
	@Override
	public String toString() {
		return "AdminInfo [aid=" + aid + ", aname=" + aname + ", pwd=" + pwd + ", tel=" + tel + "]";
	}
	
}
