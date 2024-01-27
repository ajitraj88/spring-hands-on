package stereotypeAnnotationsAndBeanScope4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student1") // student1 is the variable name
@Scope("prototype")
public class Student {
    @Value("Ajit Raj Dwivedi")
    private String name;
    @Value("Kanpur")
    private String city;

    @Value("#{temp}") // this #{temp} is spEL
    private List<String> phoneNos;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    public List<String> getPhoneNos() {
        return phoneNos;
    }

    public Student setPhoneNos(List<String> phoneNos) {
        this.phoneNos = phoneNos;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phoneNos=" + phoneNos +
                '}';
    }
}
