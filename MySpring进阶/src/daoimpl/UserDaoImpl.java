package daoimpl;

import javax.annotation.Resource;

import dao.UserDao;
import util.DBUtil;

public class UserDaoImpl implements UserDao{
	
	@Resource(name="myutil")
	private DBUtil util;
	
	//@Resource ��������������bean,����Ҳ�����Ӧ��bean,��ô�Ͱ�����������
	//һ����ʽд��name��ֵ,��ô���������name������,����Ҳ����Ͳ��ڰ�������
	
	

	public DBUtil getUtil() {
		return util;
	}

	public void setUtil(DBUtil util) {
		this.util = util;
	}

	@Override
	public void addUser() {
		System.out.println("ִ����dao����userdao��addUser����");
		util.crud();
	}

}
