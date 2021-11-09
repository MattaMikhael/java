package com.company;

public class Triangle extends GeometricObject {
    double side1=1.0;
    double side2=1.0;
    double side3=1.0;

    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public void setSides(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getPerimeter(){
        double Perimeter=side1+side2+side3;
        return Perimeter;
    }
    public double getArea(){
        double s=getPerimeter()/2;
        double Area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return Area;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
