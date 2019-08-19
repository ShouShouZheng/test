package controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import biz.UserBiz;
import bizimpl.UserBizImpl;

public class Mycontroller {
	@Resource
	private UserBiz biz;
	
	public UserBiz getBiz() {
		return biz;
	}

	public void setBiz(UserBiz biz) {
		this.biz = biz;
	}

	public void test(){
		System.out.println("调用了controller的test方法");
		biz.checkAddUser();
	}

}
