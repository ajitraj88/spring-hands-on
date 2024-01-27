package standaloneCollections3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Standalone {
    public static void main(String[] args) {
        /*
        Till now collections values say set, map etc which were given in a xml file were not reusable for other properties ir were getting mapped
        to one single property at a time. So to reuse them in multiple properties we can create standalone collections.
        Also we were allowed to create list tag which was always arrayList. So via Standalone collections we can create linkedList, arrayList etc....
         */

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/standalone-config.xml");
        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person.toString());
    }
}
