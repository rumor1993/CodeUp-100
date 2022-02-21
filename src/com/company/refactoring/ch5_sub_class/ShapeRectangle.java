package com.company.refactoring.ch5_sub_class;

public class ShapeRectangle extends Shape {
    protected ShapeRectangle(int _startx, int _starty, int _endx, int _endy) {
        super(_startx, _starty, _endx, _endy);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_RECTANGLE;
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public void draw() {
        drawRectangle();
    }

    private void drawRectangle() {
        System.out.println("drawRectangle = " + this.toString());
    }
}
