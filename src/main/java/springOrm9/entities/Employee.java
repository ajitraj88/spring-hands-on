package springOrm9.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // to make this  entity
@Table(name = "employee_details")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_city")
    private String city;

    public Employee() {
    }

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Employee setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
