package stereotypeAnnotationsAndBeanScope4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Stereotype {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/stereotype-config.xml");
        Student student1 = (Student) applicationContext.getBean("student1");
        System.out.println(student1.toString());
        System.out.println(student1.hashCode());

        Student student2 = (Student) applicationContext.getBean("student1");
        System.out.println(student2.toString());
        System.out.println(student2.hashCode());

        System.out.println("#####################################");

        Teacher teacher1 = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher1.hashCode());

        Teacher teacher2 = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher2.hashCode());
    }
}
