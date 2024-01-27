package autowiring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/autowiring-config.xml");
// Comment and Uncomment 1 at a time.

        // via name
//        Emp emp = applicationContext.getBean("emp", Emp.class);
//        System.out.println(emp.toString());

        // via type
//        Emp emp1 = applicationContext.getBean("emp1", Emp.class);
//        System.out.println(emp1.toString());

        // via constructor
        Emp emp2 = applicationContext.getBean("emp2", Emp.class);
        System.out.println(emp2.toString());

        // via autowiring
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person.toString());

    }
}
