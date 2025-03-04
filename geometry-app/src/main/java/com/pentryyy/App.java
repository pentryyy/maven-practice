package com.pentryyy;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("-------Круг------- \nПлощадь: " + circle.calculateArea() + "\nПериметр: " + circle.calculatePerimeter());
        System.out.println(circle.getDescription()); // Для версии 1.1.0

        System.out.println("--Прямоугольник--- \nПлощадь: " + rectangle.calculateArea() + "\nПериметр: " + rectangle.calculatePerimeter());
        System.out.println("---Треугольник---- \nПлощадь: " + triangle.calculateArea() + "\nПериметр: " + triangle.calculatePerimeter());
    
        System.out.println("10 см = " + GeometryUtils.convertCmToMeters(10) + " метров");
        
        System.out.println(
            GeometryUtils.compareAreas(triangle.calculateArea(), rectangle.calculateArea()) 
            ? "Площадь треугольника больше" 
            : "Площадь прямоугольника больше"
        );

        // 3D фигуры
        Cube cube = new Cube(5);
        Sphere sphere = new Sphere(3);
        TriangularPrism prism = new TriangularPrism(4, 3, 10);

        System.out.println("-----------Куб------------ \nПлощадь: " + cube.calculateArea() + "\nПериметр: " + cube.calculatePerimeter());
        System.out.println("----------Сфера----------- \nПлощадь: " + sphere.calculateArea() + "\nПериметр: " + sphere.calculatePerimeter());
        System.out.println("----Треугольная призма---- \nПлощадь: " + prism.calculateArea() + "\nПериметр: " + prism.calculatePerimeter());
    }
}
