package com.org.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
  ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        
        HelloWorldService service = (HelloWorldService) con.getBean("hello");
  
        String s1 = service.InfoData();
        
        System.out.println(s1);
    
        //set new name
        service.setName("Spring");
        service.setAddress("Java");
        s1 = service.InfoData();
        System.out.println(s1);
        
        
        
    }
}
