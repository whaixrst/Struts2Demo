package com.whaix.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
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
	public String execute(){
		if(getUsername().equals("whaix")&&getPassword().equals("192781")){
			ActionContext.getContext().getSession().put("user",getUsername());
			return SUCCESS;
		}
		return ERROR;
	}
}
