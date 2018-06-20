package com.saty.Alfred;
import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        DataInputStream z=new DataInputStream(System.in);
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	System.out.println("Which vehicle do you wanna drive- bike or car?");
    	String veh=z.readLine();
        Vehicle obj=(Vehicle)context.getBean(veh);
        obj.drive();
    }
}
