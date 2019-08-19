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
		
		//第一步  读取总配置文件
		String resourcePath="SqlMapConfig.xml";
		InputStream is=MyTest.class.getClassLoader().getResourceAsStream(resourcePath);
		
		//第二步 创建sql会话工厂
		SqlSessionFactory sfactory=new SqlSessionFactoryBuilder().build(is);
		
		//第三步 创建sql会话
		SqlSession ss=sfactory.openSession();
		
		//获取接口实例对象
		UserDao dao=ss.getMapper(UserDao.class);
		
//		User user=dao.checkLogin("王八", "123");
//		System.out.println(user.getUser_id());

//		User user =new User();
//		user.setUser_name("蔡徐坤");
//		user.setUser_pwd("123");
//		
//		if(dao.addUser(user)){
//			System.out.println("添加成功");
//		}else{
//			System.out.println("添加失败");
//		}
//		dao.deleteUserById(15);
		
//	    List<User> list=	dao.queryByPage((1-1)*3, 3);
//		for (User user : list) {
//			System.out.println(user.getUser_name());
//		}
		
		//List<User> list=dao.queryByKey2("蔡");
		List<User> list=dao.queryByIdForFanwei(8, 15);
	    for (User user : list) {
			System.out.println(user.getUser_name());
		}
	    
		ss.commit();
		
		
		//关闭session
		ss.close();
	}

}
