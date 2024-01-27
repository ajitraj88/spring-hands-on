package org.example.dependency_injection0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/config.xml");
        Student student1 = (Student) applicationContext.getBean("student1"); // setter injection being used for this
        System.out.println(student1.toString());

        Student student2 = (Student) applicationContext.getBean("student2"); // setter injection being used for this
        System.out.println(student2.toString());

        Student student3 = (Student) applicationContext.getBean("student3"); // setter injection being used for this
        System.out.println(student3.toString());

        Employee employee = (Employee) applicationContext.getBean("employee1"); // setter injection being used for this
        System.out.println(employee.toString());

        A a = (A) applicationContext.getBean("aRef"); // setter injection being used for this
        System.out.println(a.toString());

        Person person = (Person) applicationContext.getBean("person"); // constructor injection being used for this
        System.out.println(person.toString());

        Person person1 = (Person) applicationContext.getBean("person1"); // constructor injection being used for this
        System.out.println(person1.toString());

        Addition addition = (Addition) applicationContext.getBean("addition"); // constructor injection being used for this
        addition.doSum();
        /*
        ::::Ambiguity Problem::::
        By default spring treats constructor args as string.
        Then it moves from top to bottom in Addition class and finds int constructor and uses it.
        Had double been the first constructor it would have been used.
        But if there is a constructor with String params as well, then top to bottom priority is
        not there irrespective of the position of String constructor.

        To you specific type of constructor only then pass value in type attribute of constructor-arg tag
         */
        System.out.println(addition.toString());

        Addition addition1 = (Addition) applicationContext.getBean("addition1"); // constructor injection being used for this
        System.out.println(addition1.toString());
    }
}
