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
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
    }

    // square calculation using Heron's formula
    private double square() {
        return Math.sqrt((perimeter/2)*(perimeter/2 - sideA)*(perimeter/2 - sideB)*(perimeter/2 - sideC));
    }

    // define the type of triangle Isosceles/Equilateral/Rectangular/Random
    private String type() {
        if (sideA==sideB || sideA==sideC || sideB==sideC) {
            return TrianglesTypes.ISOSCELES.getTypeName();
        }
        else if (sideA==sideB && sideB==sideC) {
            return TrianglesTypes.EQUILATERAL.getTypeName();
        }
        else if ( Math.pow(sideA,2) == Math.pow(sideB,2) + Math.pow(sideC,2) || Math.pow(sideB,2) == Math.pow(sideA,2)+Math.pow(sideC,2) || Math.pow(sideC,2) == Math.pow(sideB,2) + Math.pow(sideA,2)) {
            return TrianglesTypes.RECTANGULAR.getTypeName();
        }
        else {
            return TrianglesTypes.RANDOM.getTypeName();
        }
    }

    public String getType() {
        return this.type();
    }

    // check that given triangle can exist using length of each side ( A+B>C & A+C>B & C+B>A)
    public boolean isValid() {
        if (sideA + sideB > sideC && sideA + sideC >sideB && sideC + sideB > sideA){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.format("Triangle[A%s B%s C%s]%nPerimeter: %f%nSquare %f", a, b, c, perimeter, square);
    }
}
