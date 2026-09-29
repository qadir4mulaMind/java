package org.cfs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {

        System.out.println("----------------------Beans factory---------------------");

        BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("----------------------Bean file loaded----------------------");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("Sending request................");

        System.out.println("--------------------------First Call------------------------");
        // depricated
        // BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));

        Car car1 = context.getBean(Car.class);



        car1.drive();
    }
}