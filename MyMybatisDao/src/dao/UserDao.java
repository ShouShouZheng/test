package dao;

import java.util.List;

import entity.User;

public interface UserDao {

	public User checkLogin(String name,String pwd);
	
	public boolean addUser(User user);
	
	public int deleteUserById(Integer id);
	
	public boolean updateUser(String name,String pwd,String id);
	
	public List<User> queryAll();

	public List<User> queryByPage(int page,int size);
	
	public List<User> queryByKey(String key);
	
	public List<User> queryByKey2(String key);
	
	public List<User> queryByIdForFanwei(int min,int max);
	
	//mybatis 不支持方法重载!!!!
	public List<User> queryByKey(String key1,String key2);
	
}
