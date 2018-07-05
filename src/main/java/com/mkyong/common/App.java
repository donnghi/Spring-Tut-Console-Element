package com.mkyong.common;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//        Helloworld obj = (Helloworld) context.getBean("helloBean");

        ICustomerDAO customerDAO = (ICustomerDAO) context.getBean("customerDAOImpl");
//        Customer customer = new Customer(2, "Nghi than thanh", 45);
//        customerDAO.insert(customer);

        Customer res = customerDAO.findByCustomerId(1);

        System.out.println("ID "+res.getCustID()+" Name \""+res.getName()+"\" Age "+res.getAge());

//        obj.printHello();
    }
}
