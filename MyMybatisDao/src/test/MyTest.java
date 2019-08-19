package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.UserDao;
import entity.User;

public class MyTest {
	
	public static void main(String[] args) {
		
		//��һ��  ��ȡ�������ļ�
		String resourcePath="SqlMapConfig.xml";
		InputStream is=MyTest.class.getClassLoader().getResourceAsStream(resourcePath);
		
		//�ڶ��� ����sql�Ự����
		SqlSessionFactory sfactory=new SqlSessionFactoryBuilder().build(is);
		
		//������ ����sql�Ự
		SqlSession ss=sfactory.openSession();
		
		//��ȡ�ӿ�ʵ������
		UserDao dao=ss.getMapper(UserDao.class);
		
//		User user=dao.checkLogin("����", "123");
//		System.out.println(user.getUser_id());

//		User user =new User();
//		user.setUser_name("������");
//		user.setUser_pwd("123");
//		
//		if(dao.addUser(user)){
//			System.out.println("��ӳɹ�");
//		}else{
//			System.out.println("���ʧ��");
//		}
//		dao.deleteUserById(15);
		
//	    List<User> list=	dao.queryByPage((1-1)*3, 3);
//		for (User user : list) {
//			System.out.println(user.getUser_name());
//		}
		
		//List<User> list=dao.queryByKey2("��");
		List<User> list=dao.queryByIdForFanwei(8, 15);
	    for (User user : list) {
			System.out.println(user.getUser_name());
		}
	    
		ss.commit();
		
		
		//�ر�session
		ss.close();
	}

}
