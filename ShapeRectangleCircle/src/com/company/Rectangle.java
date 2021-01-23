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

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Rectangle){
            Rectangle r = (Rectangle)obj;
            if(r.getA() == this.getA() && r.getB() ==this.getB()){
                return true;
            }
        }
        return false;
    }
}
