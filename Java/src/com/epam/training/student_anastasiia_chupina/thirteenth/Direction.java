package com.epam.training.student_anastasiia_chupina.thirteenth;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        if (degrees < 0){
            degrees = (360 + degrees%360)%360;
        }
        for (Direction dir : Direction.values()) {

            if (dir.degrees == degrees%360) {
                return dir;
            }
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        int [] degreeses = new int[8];
        int difference;
        int closest = 0;
        Direction closestDirection = null;
        degrees = degrees%360;
        if(degrees<0){
            degrees = (360+degrees)%360;
        }
        for (Direction dir : Direction.values()) {
            difference = Math.abs(degrees - dir.degrees);
            if (closestDirection == null){
                closest = difference;
                closestDirection = dir;
            }
            if (difference < closest) {
                closest = difference;
                closestDirection = dir;
            }
        }
        return closestDirection;
    }

    public Direction opposite() {
        int degreesOfOpposite = (this.degrees + 180)%360;
        return ofDegrees(degreesOfOpposite);
    }

    public int differenceDegreesTo(Direction direction) {
        int difference = Math.abs(this.degrees - direction.degrees);
        if (difference > 180){
            difference = 360 - difference;
        }
        return difference;
    }
}
