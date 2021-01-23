package com.company;

public class Main {

    public static boolean isSquare(Shape s){
        if(s instanceof Rectangle){
            Rectangle r = (Rectangle)s;
            if (r.getA() == r.getB()){
                return true;
            }
            return false;
        }
        return  false;
    }

    public static void main(String[] args) {
	// write your code here
        Shape s1 = new Rectangle(1,2);
        Shape s2 = new Circle(3);
        Shape s3 = new Rectangle(5,5);
        System.out.println(isSquare(s1));
        System.out.println(isSquare(s2));
        System.out.println(isSquare(s3));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

    }
}
