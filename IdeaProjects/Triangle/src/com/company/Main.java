package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    System.out.println(" Enter three sides");
        Scanner input = new Scanner(System.in);
        double x= input.nextDouble();
        double y= input.nextDouble();
        double z= input.nextDouble();
        Triangle Area = new Triangle(x,y,z);
        System.out.println(" Enter color");
        String color=input.next();
        Area.setColor(color);
        System.out.println(" Enter true or false sides");
        boolean filled=input.nextBoolean();
        Area.setFilled(filled);
        System.out.println(Area.getPerimeter());
        System.out.println(Area.getArea());
        System.out.println(Area.getColor());
        System.out.println(Area.isFilled());




    }
}
