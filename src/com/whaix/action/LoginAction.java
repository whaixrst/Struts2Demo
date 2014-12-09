package com.whaix.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String tip;
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String regist() throws Exception{
		ActionContext.getContext().getSession()
			.put("user", getUsername());
		setTip("恭喜您，"+getUsername()+",您已经注册成功");
		return SUCCESS;
	}
	public String execute() throws Exception{
		if(getUsername().equals("whaix")&&getPassword().equals("192781")){
			ActionContext.getContext().getSession().put("user",getUsername());
			return SUCCESS;
		}
		return ERROR;
	}
}
