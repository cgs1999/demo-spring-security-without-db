package com.duoduo.system.model;

/**
 * TODO
 * @author chengesheng@gmail.com
 * @date 2014-6-23 下午2:31:01
 * @version 1.0.0
 */
public class User {

	private String username;
	private String password;
	private Integer access;

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

	public Integer getAccess() {
		return access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

}
