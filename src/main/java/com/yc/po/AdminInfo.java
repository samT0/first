package com.yc.po;

/**
 * ����Ա��Ϣʵ��
 * @author ܲ��
 *
 */
public class AdminInfo {
	private Integer aid;//����Ա���
	private String aname;//����Ա��
	private String pwd;//����
	private String tel;//�绰
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
