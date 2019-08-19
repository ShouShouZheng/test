package daoimpl;

import javax.annotation.Resource;

import dao.UserDao;
import util.DBUtil;

public class UserDaoImpl implements UserDao{
	
	@Resource(name="myutil")
	private DBUtil util;
	
	//@Resource 按照名字来查找bean,如果找不到相应的bean,那么就按照类型来找
	//一旦显式写明name的值,那么将按照这个name来查找,如果找不到就不在按照类型
	
	

	public DBUtil getUtil() {
		return util;
	}

	public void setUtil(DBUtil util) {
		this.util = util;
	}

	@Override
	public void addUser() {
		System.out.println("执行了dao层中userdao的addUser方法");
		util.crud();
	}

}
