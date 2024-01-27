package removedXmlFileCompletely6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RemovedXmlCompletely {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
//        Student student = (Student) applicationContext.getBean("firstStudent");
//        student.study();

        Student student = (Student) applicationContext.getBean("getStudent"); // bean returned is the name of the function from where we are getting this bean getStudent. You can override it via using name attribute in Bean annotation.
        student.study();

        Student student4 = (Student) applicationContext.getBean("getStudent");
        student4.study();


    }
}
