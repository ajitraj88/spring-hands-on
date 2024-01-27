package removedXmlFileCompletely6;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component("firstStudent") // this can be replaced via @Bean
public class Student {

    private Sweet sweet;


    public void study() {
        System.out.println("Student is studying.");
    }


    public Student(Sweet sweet) {
        this.sweet = sweet;
    }

    public Sweet getSweet() {
        return sweet;
    }

    public Student setSweet(Sweet sweet) {
        this.sweet = sweet;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sweet=" + sweet +
                '}';
    }
}
