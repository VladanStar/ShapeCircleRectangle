package com.company;

public class Rectangle extends Shape {
    double a;
    double b;

    @Override
    public double area() {

        return a*b;
    }

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                '}';
    }
}
