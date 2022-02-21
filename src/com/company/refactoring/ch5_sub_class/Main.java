package com.company.refactoring.ch5_sub_class;

public class Main {
    public static void main(String[] args) {
        Shape line = Shape.createShape(ShapeFactory.LineFactory.getInstance(), 0, 0, 100, 200);
        Shape rectangle = Shape.createShape(ShapeFactory.LineFactory.getInstance(), 10, 20, 30, 40);
        Shape oval = Shape.createShape(ShapeFactory.LineFactory.getInstance(), 100, 200, 300, 400);

        Shape[] shapes = {
                line, rectangle, oval
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
