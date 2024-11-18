package com.Laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Laptop laptop = context.getBean(Laptop.class);
        laptop.getDetails();
        
        Laptop laptop1 = context.getBean(Laptop.class);
        laptop1.brand = "HP";
        System.out.println(laptop.brand);
        System.out.println(laptop1.brand);
    }
}
