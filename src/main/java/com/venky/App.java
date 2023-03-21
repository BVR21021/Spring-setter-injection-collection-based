package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        StudentBean ab=(StudentBean)ctx.getBean("Sb");
      ab.printStudentNames();
      ab.printStudentId();
      ab.printStudentBranchDetails();
      ab.printStudentBranchInfo();
       
    }
}
