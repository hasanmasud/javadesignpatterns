package com.hcl.ingbootcamp.javadesignpattern.adaptor;

public class AdapterDemo {

	public static void main(String... args) {

		SocketAdapter socketAdapter = new SocketAdapterImpl();
		SocketAdapter socketAdapterObj = new SocketAdapterImpl();

		System.out.println(socketAdapter.get2Volt().getVolts());
		System.out.println(socketAdapterObj.get2Volt().getVolts());

	}

}