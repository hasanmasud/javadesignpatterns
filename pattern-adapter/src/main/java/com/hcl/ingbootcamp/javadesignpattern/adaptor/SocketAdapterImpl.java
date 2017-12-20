package com.hcl.ingbootcamp.javadesignpattern.adaptor;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volt get3Volt() {
		return new Volt(getVolts().getVolts() / 40);
	}

	@Override
	public Volt get4Volt() {
		return new Volt(getVolts().getVolts() / 30);
	}

	@Override
	public Volt get2Volt() {
		return new Volt(getVolts().getVolts() / 60);
	}

}
