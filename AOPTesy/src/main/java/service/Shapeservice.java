package service;

import AOP.Circle;
import AOP.Triangle;
import aspect.Loggable;
public class Shapeservice {
    private Circle circle;
    private Triangle triangle;
    @Loggable
    public Circle getCircle() {
        System.out.println("Circle getter called");
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

}
