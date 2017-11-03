package com.design.pattern.factory;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黑种人的皮肤黑颜色");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黑种人说话听不懂");
	}

}
