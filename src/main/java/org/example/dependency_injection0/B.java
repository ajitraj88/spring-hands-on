package org.example.dependency_injection0;

public class B {
    private int y;

    public B() {
    }

    public B(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public B setY(int y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                '}';
    }
}
