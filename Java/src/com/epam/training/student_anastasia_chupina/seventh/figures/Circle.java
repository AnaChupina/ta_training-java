package com.epam.training.student_anastasia_chupina.seventh.figures;

class Circle extends Figure {
    double radius;
    Point center;
    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
    public String pointsToString() {
        return center.toString();
    }
    public String toString() {
        return "Circle[" + pointsToString() + radius + "]";
    }
    public Point leftmostPoint(){
        return new Point(center.getX()-radius, center.getY());
    }
}
