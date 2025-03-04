package com.pentryyy;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Добавлено для версии 1.1.0
    public String getDescription() {
        return "Круг с радиусом " + radius;
    }
}
