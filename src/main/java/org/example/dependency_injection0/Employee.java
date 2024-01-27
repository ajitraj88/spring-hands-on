package org.example.dependency_injection0;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    public Employee() {
    }

    public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getPhones() {
        return phones;
    }

    public Employee setPhones(List<String> phones) {
        this.phones = phones;
        return this;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public Employee setAddresses(Set<String> addresses) {
        this.addresses = addresses;
        return this;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public Employee setCourses(Map<String, String> courses) {
        this.courses = courses;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                '}';
    }
}
