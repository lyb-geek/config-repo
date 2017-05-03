package com.springcloud.demo.consumer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2160236877935768581L;
	private Long id;
	private String username;
	private int age;
	private BigDecimal balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", balance=" + balance + "]";
	}

}
