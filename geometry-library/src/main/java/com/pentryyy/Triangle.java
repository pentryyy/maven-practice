package com.pentryyy;

public class Triangle implements Figure {
    
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (Math.pow(sideC, 2) != Math.pow(sideA, 2) + Math.pow(sideB, 2)) {
            throw new RuntimeException("Такой треугольник не существует");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }


    @Override
    public double calculateArea() {
        double perimeter = calculatePerimeter() / 2;
        return Math.sqrt(perimeter * 
                        (perimeter - sideA) * 
                        (perimeter - sideB) * 
                        (perimeter - sideC));
    }
}
