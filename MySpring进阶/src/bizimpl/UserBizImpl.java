package bizimpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import biz.UserBiz;
import dao.UserDao;
import daoimpl.UserDaoImpl;

public class UserBizImpl implements UserBiz{

	@Autowired
	@Qualifier(value="myuserdao2")
	private UserDao dao;
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void checkAddUser() {
		System.out.println("调用了biz中的checkAddUser方法");
		dao.addUser();
	}

}
