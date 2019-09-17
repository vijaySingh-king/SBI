package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class CheckVoting implements InitializingBean, DisposableBean {
	private String name,addrs;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setAge(int age) {
		this.age = age;
	}
//custom init method
	public void check()
	{
		System.out.println("Bean costom init");
	}
	
	public String checkVotingEligibility()
	{
		if(age>=18)
		{
			return name+"u are elegible to vote";
		}
		else
		{
			return name+"u are not elegible to vote";
		}
		
	}
	//costom destroy method
	public void myDestroy()
	{
		System.out.println("Bean:custom Destroy");
		name=null;
		age=0;
		addrs=null;
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
