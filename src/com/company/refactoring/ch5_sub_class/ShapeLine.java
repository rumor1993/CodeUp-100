package com.company.refactoring.ch5_sub_class;

public class ShapeLine extends Shape {
    protected ShapeLine(int _startx, int _starty, int _endx, int _endy) {
        super(_startx, _starty, _endx, _endy);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        drawLine();
    }

    private void drawLine() {
        System.out.println("drawLine = " + this.toString());
    }
}
