package com.signatureverification.client.main.model;

import javax.validation.constraints.NotEmpty;

public class UserDetailsModel {

	@NotEmpty(message = "user nam is required")
	private String userName;

	private String userBuInfo;

	@NotEmpty(message = "user nam is required")
	private String userPwd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserBuInfo() {
		return userBuInfo;
	}

	public void setUserBuInfo(String userBuInfo) {
		this.userBuInfo = userBuInfo;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

}
