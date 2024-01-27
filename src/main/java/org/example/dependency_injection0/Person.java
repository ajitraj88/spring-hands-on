package org.example.dependency_injection0;

public class Person {
    private String id;
    private String name;
    private Certificate certificate;

    public Person(String id, String name, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}
