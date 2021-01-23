package com.company;

public class Circle extends Shape {
    double r;
    @Override
    public double area() {
        return 0;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}
