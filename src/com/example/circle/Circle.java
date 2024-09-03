package com.example.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {

    private double radius;

    public Circle(double a) {
        this.radius = a;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius, 2) ;
    }
}
