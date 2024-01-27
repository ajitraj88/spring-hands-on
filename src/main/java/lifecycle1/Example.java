package lifecycle1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String subject;

    public Example() {
    }

    public Example(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public Example setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void start() {
        System.out.println("Inside init of Example");
    }

    @PreDestroy
    public void end() {
        System.out.println("Inside destroy of Example");
    }
}
