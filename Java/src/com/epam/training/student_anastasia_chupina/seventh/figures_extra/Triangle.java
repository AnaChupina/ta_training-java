package com.epam.training.student_anastasia_chupina.seventh.figures_extra;

public class Triangle extends Figure {
    Point a, b, c;
    double lengthAB;
    double lengthBC;
    double lengthAC;
    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException();
        }
        lengthAB = Math.sqrt((Math.pow((a.getX() - b.getX()), 2)) + (Math.pow((a.getY() - b.getY()), 2)));
        lengthBC = Math.sqrt((Math.pow((b.getX() - c.getX()), 2)) + (Math.pow((b.getY() - c.getY()), 2)));
        lengthAC = Math.sqrt((Math.pow((a.getX() - c.getX()), 2)) + (Math.pow((a.getY() - c.getY()), 2)));
        this.a = a;
        this.b = b;
        this.c = c;
        if (isItDegenerative()) {
            throw new IllegalArgumentException();
        }
        if (area () == 0) {
            throw new IllegalArgumentException();
        }
    }
    private double area() {
        //Heron's formula
        double s = (lengthAB + lengthAC + lengthBC)/2;
        return Math.sqrt(s*(s-lengthAB)*(s-lengthAC)*(s-lengthBC));
    }
    private boolean isItDegenerative () {
        double delta = 1E-6;
        if ((lengthAB + lengthBC) > (lengthAC + delta) && (lengthBC + lengthAC) > (lengthAB + delta)
                && (lengthAB + lengthAC) > (lengthBC + delta)) {
            return false;
        } else {
            return true;
        }
    }
    public Point centroid(){
        double centroidX = (a.getX()+b.getX()+c.getX())/3;
        double centroidY = (a.getY()+b.getY()+c.getY())/3;
        return new Point(centroidX, centroidY);
    }
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            if (a.isTheSame(triangle.a) ){
                if (b.isTheSame(triangle.b ) && c.isTheSame(triangle.c)){
                    return true;
                } else if (b.isTheSame(triangle.c) && c.isTheSame(triangle.b)){
                    return true;
                }
            } else if (a.isTheSame(triangle.b)){
                if (b.isTheSame(triangle.a ) && c.isTheSame(triangle.c)){
                    return true;
                } else if (b.isTheSame(triangle.c) && c.isTheSame(triangle.a)){
                    return true;
                }
            } else if (a.isTheSame(triangle.c)) {
                if (b.isTheSame(triangle.b ) && c.isTheSame(triangle.a)){
                    return true;
                } else if (b.isTheSame(triangle.a) && c.isTheSame(triangle.b)){
                    return true;
                }
            }
        }
        return false;
    }
}
