package demo.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext container =
                          new ClassPathXmlApplicationContext("config.xml");

//      Car car = (Car) container.getBean("Car");
      Car car = container.getBean(Car.class);
      car.drive();
      System.out.println("---------------------------------------------");
      String[] beans = container.getBeanDefinitionNames();
      for(String bean : beans)
           System.out.println(bean);
        System.out.println("Number of bean(s) available in the Spring IOC Container: "+container.getBeanDefinitionCount());
    }
}