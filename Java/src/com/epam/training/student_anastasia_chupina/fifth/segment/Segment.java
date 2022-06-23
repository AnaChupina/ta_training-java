package com.epam.training.student_anastasia_chupina.fifth.segment;

public class Segment {
    double startX;
    double startY;
    double endX;
    double endY;
    double length;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
            throw new IllegalArgumentException();
        } else {
            startX = start.getX();
            startY = start.getY();
            endX = end.getX();
            endY = end.getY();
        }
    }

    double length() {
        double i = Math.pow((endX-startX),2);
        double j = Math.pow((endY-startY), 2);
        length = Math.sqrt(i+j);
        return length;
    }

    Point middle() {
        double middleX = (endX+startX)/2;
        double middleY = (endY+startY)/2;
        return new Point (middleX, middleY);
    }

    Point intersection(Segment another) {
        double x1 = startX;
        double x2 = endX;
        double x3 = another.startX;
        double x4 = another.endX;
        double y1 = startY;
        double y2 = endY;
        double y3 = another.startY;
        double y4 = another.endY;
        double t = ((x1-x3)*(y3-y4) - (y1-y3)*(x3-x4))/((x1-x2)*(y3-y4) - (y1-y2)*(x3-x4));
        if (t >=0 && t<=1) {
            double interX = (x1 + t*(x2-x1));
            double interY = (y1 + t*(y2-y1));
            if (interX<=Math.max(x1,x2) && interX>=Math.min(x1,x2) && interX<=Math.max(x3,x4) && interX>=Math.min(x3,x4) && interY<=Math.max(y1,y2) && interY>=Math.min(y1,y2) && interY<= Math.max(y3,y4) && interY>=Math.min(y3,y4)) {
                return new Point(interX, interY);
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

}
