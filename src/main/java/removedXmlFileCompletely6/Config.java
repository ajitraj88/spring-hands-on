package removedXmlFileCompletely6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // tells that this is a config file
@ComponentScan(basePackages = "removedXmlFileCompletely6") // this is also not needed once you are returning objects via @Bean annotation.
public class Config {

    @Bean(name = {"student1", "student2", "getStudent", "student3", "student4"}) // tells that object returned from here should go to IOC container. Then from the IOC container we will get this object.
    public Student getStudent() {
        return new Student(getSweet());
    }

    @Bean
    public Sweet getSweet() {
        return new Sweet();
    }
}
