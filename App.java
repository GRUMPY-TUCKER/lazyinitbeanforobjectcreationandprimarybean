package org.maven;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates the container
        Alien obj = (Alien) context.getBean("alien1");
        obj.code();
        //System.out.println(obj.age);
        System.out.println( "Hello World!" );
        System.out.println(obj.getAge());
        Alien obj2 = (Alien) context.getBean("alien1");
        obj2.code();
        System.out.println(obj2.getAge());
        Alien obj3 = (Alien) context.getBean("alien1");
        obj3.code();
        obj3.setAge(34);
        System.out.println(obj3.getAge());
        //After implementing lazy-init, we can only call the desktop object once we have created it on my own
        Desktop desk = (Desktop) context.getBean("comp2");
    }
}
