package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.Mycontroller;

public class MyTest {
	
	public static void main(String[] args) {
		
//		Mycontroller my=new Mycontroller();
//		my.test();
		
		
		//��ȡspring�����ļ�
		String filename="applicationContext.xml";
	    //��ȡspring�����ļ��е�������	
	    AbstractApplicationContext aac=new ClassPathXmlApplicationContext(new String[]{filename});	

	    Mycontroller my=(Mycontroller) aac.getBean("mycontroller"); 
		my.test();
		
		aac.close();
	}

}
