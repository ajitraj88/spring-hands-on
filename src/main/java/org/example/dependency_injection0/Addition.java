package org.example.dependency_injection0;

public class Addition {
    private int a;
    private int b;

    public Addition() {
    }

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void doSum() {
        System.out.println("Sum is = " + (a + b));
    }
}
