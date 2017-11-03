package com.design.pattern.factory;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("白种人的皮肤白颜色");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("白种人说话一长串");
	}

}
