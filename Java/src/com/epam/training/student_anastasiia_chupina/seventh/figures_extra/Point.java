package com.epam.training.student_anastasiia_chupina.seventh.figures_extra;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point add(Point other) {
        return new Point(x + other.x, y + other.y);
    }

    public Point sub(Point other) {
        return new Point(x - other.x, y - other.y);
    }

    public double cross(Point other) {
        return x * other.y - y * other.x;
    }

    public Point div(double other) {
        return new Point(x / other, y / other);
    }
    public boolean isTheSame (Point other) {
        double delta = 1e-6;
        return Math.abs(x - other.x) < delta && Math.abs(y - other.y) < delta;
    }
}
