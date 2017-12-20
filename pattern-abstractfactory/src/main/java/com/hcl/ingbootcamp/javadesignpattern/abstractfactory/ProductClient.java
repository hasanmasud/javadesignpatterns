package com.hcl.ingbootcamp.javadesignpattern.abstractfactory;

public class ProductClient {

	public static void main(String... args) {

		AbstractFactory abstractFactory1 = new ConcreateFactory1();
		abstractFactory1.createProductA().showPrice();
		abstractFactory1.createProductB().showPrice();
		
		AbstractFactory abstractFactory2 = new ConcreateFactory2();
		abstractFactory2.createProductA().showPrice();
		abstractFactory2.createProductB().showPrice();
		
		

	}

}
