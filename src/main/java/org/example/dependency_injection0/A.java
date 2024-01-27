package org.example.dependency_injection0;

public class A {
    private int x;
    private B b;

    public A() {
    }

    public A(int x, B b) {
        this.x = x;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public A setX(int x) {
        this.x = x;
        return this;
    }

    public B getB() {
        return b;
    }

    public A setB(B b) {
        this.b = b;
        return this;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", b=" + b +
                '}';
    }
}
