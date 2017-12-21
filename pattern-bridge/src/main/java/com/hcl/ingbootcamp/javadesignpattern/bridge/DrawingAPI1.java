package com.hcl.ingbootcamp.javadesignpattern.bridge;

class DrawingAPI1 implements DrawingAPI {
	public void drawCircle(final double x, final double y, final double radius) {
		System.out.println("implementation 1 - > (" + x + "," + y + "," + radius + ")");
	}
}