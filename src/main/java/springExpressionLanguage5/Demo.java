package springExpressionLanguage5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Demo {
    @Value("#{22 + 22}")
    private int x;
    @Value("#{44 + 44}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}") // SpEL for static methods
    private double z;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{new java.lang.String('Ajit Raj Dwivedi')}}")
    private String name;

    @Value("#{44 > 4 ? true : false}")
    private boolean isActive;

    public int getX() {
        return x;
    }

    public Demo setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Demo setY(int y) {
        this.y = y;
        return this;
    }

    public double getZ() {
        return z;
    }

    public Demo setZ(double z) {
        this.z = z;
        return this;
    }

    public double getPi() {
        return pi;
    }

    public Demo setPi(double pi) {
        this.pi = pi;
        return this;
    }

    public String getName() {
        return name;
    }

    public Demo setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isActive() {
        return isActive;
    }

    public Demo setActive(boolean active) {
        isActive = active;
        return this;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", pi=" + pi +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
