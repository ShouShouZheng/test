package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.Mycontroller;

public class MyTest {
	
	public static void main(String[] args) {
		
//		Mycontroller my=new Mycontroller();
//		my.test();
		
		
		//读取spring配置文件
		String filename="applicationContext.xml";
	    //读取spring配置文件中的配置项	
	    AbstractApplicationContext aac=new ClassPathXmlApplicationContext(new String[]{filename});	

	    Mycontroller my=(Mycontroller) aac.getBean("mycontroller"); 
		my.test();
		
		aac.close();
	}

}
