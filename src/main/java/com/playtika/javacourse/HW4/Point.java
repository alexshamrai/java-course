package com.playtika.javacourse.HW4;

public class Point {

    protected float x;
    protected float y;

    //constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //distance from one point to the other using the following formula: sqrt( (x1 - x2)^2 + (y1 - y2)^2 )
    public double distance(Point pointTo) {
        return Math.sqrt((Math.pow((this.x - pointTo.x),2) + Math.pow((this.y - pointTo.y),2)));
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y+ ")";
    }

}
