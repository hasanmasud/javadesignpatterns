package com.hcl.ingbootcamp.javadesignpattern.adaptor;

public class Socket {

	public Volt getVolts() {
		return new Volt(120);
	}

}
