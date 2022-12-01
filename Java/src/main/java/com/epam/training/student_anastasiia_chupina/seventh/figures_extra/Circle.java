package com.epam.training.student_anastasiia_chupina.seventh.figures_extra;

public class Circle extends Figure {
    double radius;
    Point center;
    public Circle(Point center, double radius) {
        if (center == null) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
        this.center = center;
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        if (area () == 0) {
            throw new IllegalArgumentException();
        }
    }
    private double area() {
        return Math.PI*Math.pow(radius,2);
    }
    public Point centroid(){
        return center;
    }
    public boolean isTheSame(Figure figure) {
        double delta = 1E-6;
        if (figure instanceof Circle) {
            Circle circle = (Circle) figure;
            if (Math.abs(circle.radius - radius) < delta && center.isTheSame(circle.center)) {
                return true;
            }
        }
        return false;
    }
}
