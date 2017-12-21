package com.hcl.ingbootcamp.javadesignpattern.bridge;

class DrawingAPI2 implements DrawingAPI {
	public void drawCircle(final double x, final double y, final double radius) {
		System.out.println("implementation 2 - > (" + x + "," + y + "," + radius + ")");
	}
}