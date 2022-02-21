package com.company.refactoring.ch5_sub_class;

public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public static Shape createShape(ShapeFactory factory, int _startx, int _starty, int _endx, int _endy) {
        return factory.create(_startx, _starty, _endx, _endy);
    }

    protected Shape(int _startx, int _starty, int _endx, int _endy) {
        this._startx = _startx;
        this._starty = _starty;
        this._endx = _endx;
        this._endy = _endy;
    }

    public abstract int getTypeCode();
    public abstract String getName();
    public abstract void draw();

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + _startx + ", " + _starty + ") -"
                + "(" + _endx + ", " + _endy + ") ]";
    }


}
