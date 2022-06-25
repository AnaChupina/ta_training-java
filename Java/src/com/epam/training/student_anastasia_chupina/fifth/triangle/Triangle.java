package com.epam.training.student_anastasia_chupina.fifth.triangle;

public class Triangle {
    double aX;
    double aY;
    double bX;
    double bY;
    double cX;
    double cY;
    double lengthAB;
    double lengthBC;
    double lengthAC;

    public Triangle(Point a, Point b, Point c) {
        lengthAB = Math.sqrt((Math.pow((a.getX()-b.getX()),2))+(Math.pow((a.getY()-b.getY()), 2)));
        lengthBC = Math.sqrt((Math.pow((b.getX()-c.getX()),2))+(Math.pow((b.getY()-c.getY()), 2)));
        lengthAC = Math.sqrt((Math.pow((a.getX()-c.getX()),2))+(Math.pow((a.getY()-c.getY()), 2)));
        if ((lengthAB+lengthBC) > lengthAC && (lengthBC+lengthAC) > lengthAB && (lengthAB + lengthAC) > lengthBC) {
            aX = a.getX();
            aY = a.getY();
            bX = b.getX();
            bY = b.getY();
            cX = c.getX();
            cY = c.getY();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        //Heron's formula
        double s = (lengthAB + lengthAC + lengthBC)/2;
        double area = Math.sqrt(s*(s-lengthAB)*(s-lengthAC)*(s-lengthBC));
        return area;
    }

    public Point centroid(){
        double centroidX = (aX+bX+cX)/3;
        double centroidY = (aY+bY+cY)/3;
        return new Point(centroidX, centroidY);
    }
}
