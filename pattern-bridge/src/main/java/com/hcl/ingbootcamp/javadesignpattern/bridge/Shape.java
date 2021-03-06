package com.hcl.ingbootcamp.javadesignpattern.bridge;

abstract class Shape {

    protected DrawingAPI drawingAPI;

    protected Shape(final DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();

    public abstract void resizeByPercentage(final double pct);
}