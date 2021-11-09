package com.company;


public  class Triangle extends GeometricObject {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle (){

    }
    public Triangle (Double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public void setSides(double side1,double side2, double side3) {
        this.side1 = side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea(){
        double s=getPerimeter()/2;
        double area= Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return "com.company.GeometricObject.Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
}