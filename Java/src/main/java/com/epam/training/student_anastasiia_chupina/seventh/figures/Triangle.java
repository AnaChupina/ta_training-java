package com.epam.training.student_anastasiia_chupina.seventh.figures;

class Triangle extends Figure {
    Point a, b, c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area() {
        //Heron's formula
        double lengthAB = Math.sqrt((Math.pow((a.getX()-b.getX()),2))+(Math.pow((a.getY()-b.getY()), 2)));
        double lengthBC = Math.sqrt((Math.pow((b.getX()-c.getX()),2))+(Math.pow((b.getY()-c.getY()), 2)));
        double lengthAC = Math.sqrt((Math.pow((a.getX()-c.getX()),2))+(Math.pow((a.getY()-c.getY()), 2)));
        double s = (lengthAB + lengthAC + lengthBC)/2;
        return Math.sqrt(s*(s-lengthAB)*(s-lengthAC)*(s-lengthBC));
    }
    public String pointsToString(){
        return a.toString() + b.toString() + c.toString();
    }
    public String toString() {
        return "Triangle[" + pointsToString() + "]";
    }
    public Point leftmostPoint(){
        Point min = a;
        if (b.getX() < min.getX()) {
            min = b;
        }
        if (c.getX() < min.getX()) {
            min = c;
        }
        return min;
    }
}
