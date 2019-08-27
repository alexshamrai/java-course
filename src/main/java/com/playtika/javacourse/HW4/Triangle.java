package com.playtika.javacourse.HW4;

public class Triangle {
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return 2.0;
    }

    public double square() {
        return 3.0;
    }

    public String type() {
        return null;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
