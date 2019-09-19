package com.yc.po;

public class MemberInfo {
	private Integer mno;//会员编号
	private String nickname;//会员名
	private String pwd;//密码
	private String tel;//电话
	private String email;//邮箱
	private String photo;//图片路径
	private String realName;//真实姓名
	private String sex;//性别
	private String regDate;//注册时间
	private Integer status;//状态
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public MemberInfo(Integer mno, String nickname, String pwd, String tel, String email, String photo, String realName,
			String sex, String regDate, Integer status) {
		super();
		this.mno = mno;
		this.nickname = nickname;
		this.pwd = pwd;
		this.tel = tel;
		this.email = email;
		this.photo = photo;
		this.realName = realName;
		this.sex = sex;
		this.regDate = regDate;
		this.status = status;
	}
	public MemberInfo() {
		super();
	}
	@Override
	public String toString() {
		return "MemberInfo [mno=" + mno + ", nickname=" + nickname + ", pwd=" + pwd + ", tel=" + tel + ", email="
				+ email + ", photo=" + photo + ", realName=" + realName + ", sex=" + sex + ", regDate=" + regDate
				+ ", status=" + status + "]";
	}
	
}
