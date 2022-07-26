package com.springcore.ci;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/constructorconfig.xml");
       Person persons = (Person) context.getBean("person");
       System.out.println(persons);
       
       Addition addition =(Addition) context.getBean("add");
       addition.doSum();
    }
}
