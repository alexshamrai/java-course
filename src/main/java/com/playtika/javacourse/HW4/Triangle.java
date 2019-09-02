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
    // perimeter calculation
    public double perimeter() {
        return a.distance(b) + b.distance(c) + c.distance(a);
    }

    // square calculation using Heron's formula
    public double square() {
        return Math.sqrt((this.perimeter()/2) * (this.perimeter()/2 - a.distance(b)) * (this.perimeter()/2 - b.distance(c)) * (this.perimeter()/2 - c.distance(a)) );
    }

    // define the type of triangle Isosceles/Equilateral/Rectangular/Random
    public String type() {
        if (a.distance(b)==b.distance(c) || a.distance(b)==c.distance(a) || b.distance(c)==c.distance(a)) {
            return "Isosceles";
        }
        else if (a.distance(b)==b.distance(c) && b.distance(c)==c.distance(a)) {
            return "Equilateral";
        }
        else if ( Math.pow(a.distance(b),2) == Math.pow(b.distance(c),2) + Math.pow(c.distance(a),2) || Math.pow(b.distance(c),2) == Math.pow(a.distance(b),2)+Math.pow(c.distance(a),2) || Math.pow(c.distance(a),2) == Math.pow(b.distance(c),2) + Math.pow(c.distance(a),2)) {
            return "Rectangular";
        }
        else {
            return "Random";
        }
    }

    // check that given triangle can exist using length of each side ( A+B>C & A+C>B & C+B>A)
    public boolean isValid() {
        if ( a.distance(b) + b.distance(c) > c.distance(a) && a.distance(b) + c.distance(a) > b.distance(c) && c.distance(a) + b.distance(c) > a.distance(b)){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Triangle [A" + a + " B" + b + " C" + c + "]";
    }
}
