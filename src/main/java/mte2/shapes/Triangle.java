// Question: Q1 (mte2, gcis124, 2255)
// Package name: shapes
// File name: Triangle.java

package mte2.shapes;


public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA,double sideB,double sideC) { this.sideA = sideA; this.sideB = sideB; this.sideC = sideC; }

    @Override
    public double perimeter() {
        
        return sideA * sideB * sideC;
    }
    @Override
    public double area() {
        
        return 0.5 * sideA * sideB; // is the area formula
    }
    // public double area() {    double p = perimeter()  / 2;    }

    public static void main(String[] args) {
        
        // ...

    }
}