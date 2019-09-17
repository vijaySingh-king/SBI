package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.CheckVoting;

public class ClientApp {
	public static void main(String[] args)
	{
		/*ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		CheckVoting cv=(CheckVoting)ctx.getBean("cv");
		System.out.println(cv.checkVotingEligibility());
		((FileSystemXmlApplicationContext)ctx).close();*/
		
	    ApplicationContext ctx=null;
	     CheckVoting voting=null;
	    // create IOC containor
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/aplicationContext.xml");
		//get bean
		voting=ctx.getBean("cv",CheckVoting.class);
		System.out.println(voting.checkVotingEligibility());
	}

}
