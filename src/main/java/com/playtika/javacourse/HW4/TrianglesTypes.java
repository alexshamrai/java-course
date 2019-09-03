package com.playtika.javacourse.HW4;

/* enum for storing types of Triangles */

public enum TrianglesTypes {
    ISOSCELES(1, "Isosceles"),
    EQUILATERAL(2, "Equilateral"),
    RECTANGULAR(3,"Rectangular"),
    RANDOM(4, "Random");


    private int type;
    private String typeName;

    TrianglesTypes(int type, String typeName) {
        this.type = type;
        this.typeName = typeName;
    }

    public int getType() {
        return type;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return type + " " + typeName;
    }
}
