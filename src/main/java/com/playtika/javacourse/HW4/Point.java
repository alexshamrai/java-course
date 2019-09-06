package com.playtika.javacourse.HW4;

public class Point {

    private float x;
    private float y;

    //constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //distance from one point to the other using the following formula: sqrt( (x1 - x2)^2 + (y1 - y2)^2 )
    private double calculateDistance(Point pointTo) {
        double distance = Math.sqrt((Math.pow((this.x - pointTo.x),2) + Math.pow((this.y - pointTo.y),2)));
        double roundedDistance = Math.round(distance*10)/10.0;
        return roundedDistance;
    }

    public double getDistance(Point pointTo) {
        return calculateDistance(pointTo);
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y+ ")";
    }

}
