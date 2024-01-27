package autowiring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    @Autowired // Property injection
    @Qualifier("name2") // if there are 2 beans of this class type. You can tell which bean name to be referred here.
    private Name name;

//    @Autowired // Constructor injection
    public Person(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

//    @Autowired // Setter injection
    public Person setName(Name name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                '}';
    }
}
