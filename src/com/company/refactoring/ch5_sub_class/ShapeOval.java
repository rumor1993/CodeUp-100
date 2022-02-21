package com.company.refactoring.ch5_sub_class;

public class ShapeOval extends Shape {
    protected ShapeOval(int _startx, int _starty, int _endx, int _endy) {
        super(_startx, _starty, _endx, _endy);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_OVAL;
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        drawOval();
    }

    private void drawOval() {
        System.out.println("drawOval = " + this.toString());
    }
}
