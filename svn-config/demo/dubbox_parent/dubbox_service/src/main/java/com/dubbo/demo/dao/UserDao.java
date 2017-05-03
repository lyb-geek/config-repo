package com.dubbo.demo.dao;

import java.util.List;
import java.util.Set;

import com.dubbox.demo.common.entity.User;

public interface UserDao {

	/**
	 * 根据帐号查询用户信息
	 * 
	 * @param name
	 * @return
	 */
	public User getUserByName(String username);

	/**
	 * 根据id查询用户角色信息
	 * 
	 * @param id
	 * @return
	 */
	public Set<String> getRoleByName(String username);

	/**
	 * 根据帐号查询权限
	 * 
	 * @param name
	 * @return
	 */
	public Set<String> getPermitByName(String username);

	/**
	 * 查询全部用户
	 * 
	 * @return
	 */
	public List<User> queryUser();

	/**
	 * 根据id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	public User findOne(String id);

}
