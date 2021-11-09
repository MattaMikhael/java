package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter side1 of the triangle");
    double x= input.nextDouble();
    System.out.println("Please enter side2 of the triangle");
    double y= input.nextDouble();
    System.out.println("Please enter side3 of the triangle");
    double z=input.nextDouble();
    Triangle Area= new Triangle(x,y,z);
    System.out.println("Please enter color of the triangle");
    String color=input.next();
    Area.setColor(color);
    System.out.println("Please enter boolian of the triangle");
    Boolean filled=input.nextBoolean();
    Area.setFilled(filled);
    System.out.println(Area.getPerimeter());
    System.out.println(Area.getArea());
    System.out.println(Area.getColor());
    System.out.println(Area.isFilled());

    }
}
