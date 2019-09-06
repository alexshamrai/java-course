package com.playtika.javacourse.HW4;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double sideA;
    private double sideB;
    private double sideC;
    private double perimeter;
    private double square;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sideA = a.getDistance(b);
        this.sideB = b.getDistance(c);
        this.sideC = c.getDistance(a);
        this.perimeter = this.perimeter();
        this.square = this.square();
    }

    // perimeter calculation
    private double perimeter() {
        return sideA + sideB + sideC;
    }

    // square calculation using Heron's formula
    private double square() {
        return Math.sqrt((perimeter/2)*(perimeter/2 - sideA)*(perimeter/2 - sideB)*(perimeter/2 - sideC));
    }

    // define the type of triangle Isosceles/Equilateral/Rectangular/Random
    private String type() {
        if (isEquilateral()) {
            return TrianglesTypes.EQUILATERAL.getTypeName();
        }
        else if (isIsosceles()) {
            return TrianglesTypes.ISOSCELES.getTypeName();
        }
        else if (isRectangular()) {
            return TrianglesTypes.RECTANGULAR.getTypeName();
        }
        else {
            return TrianglesTypes.RANDOM.getTypeName();
        }
    }

    private boolean isIsosceles(){
        return (sideA==sideB || sideA==sideC || sideB==sideC);
    }

    private boolean isEquilateral(){
        return (sideA==sideB && sideB==sideC);
    }

    private boolean isRectangular() {
        return (Math.pow(sideA,2) == Math.pow(sideB,2) + Math.pow(sideC,2) || Math.pow(sideB,2) == Math.pow(sideA,2)+Math.pow(sideC,2) || Math.pow(sideC,2) == Math.pow(sideB,2) + Math.pow(sideA,2));
    }

    public String getType() {
        return this.type();
    }

    // check that given triangle can exist using length of each side ( A+B>C & A+C>B & C+B>A)
    public boolean isValid() {
            return ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideC + sideB > sideA) && sideA >0 && sideB > 0 && sideC > 0 );
    }
    @Override
    public String toString() {
        return String.format("Triangle[A%s B%s C%s]%nPerimeter: %.1f%nSquare: %.1f", a, b, c, perimeter, square);
    }

}
