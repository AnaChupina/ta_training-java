package com.epam.training.student_anastasiia_chupina.fifth.line;

public class Line {
    public int k;
    public int b;
    int x;
    int y;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (other.k != this.k) {
            y = (other.b*this.k - other.k*this.b)/(this.k - other.k);
            x = (y - this.b)/this.k;
            return new Point(x,y);
        } else {
            return null;
        }
    }
}
