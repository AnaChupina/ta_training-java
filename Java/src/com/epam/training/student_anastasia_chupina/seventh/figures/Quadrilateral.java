package com.epam.training.student_anastasia_chupina.seventh.figures;

class Quadrilateral extends Figure {
    Point a, b, c, d;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double area() {
        double aX = a.getX();
        double aY = a.getY();
        double bX = b.getX();
        double bY = b.getY();
        double cX = c.getX();
        double cY = c.getY();
        double dX = d.getX();
        double dY = d.getY();
        return 0.5*(Math.abs((aX-bX)*(aY+bY)+(bX-cX)*(bY+cY)+(cX-dX)*(cY+dY)+(dX-aX)*(dY+aY)));
    }
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }
    public String toString() {
        return "Quadrilateral[" + pointsToString() + "]";
    }
    public Point leftmostPoint(){
        Point min = a;
        if (b.getX() < min.getX()) {
            min = b;
        }
        if (c.getX() < min.getX()) {
            min = c;
        }
        if (d.getX() < min.getX()) {
            min = d;
        }
        return min;
    }
}