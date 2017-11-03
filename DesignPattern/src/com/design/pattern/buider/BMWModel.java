package com.design.pattern.buider;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马开火。。。");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马熄火。。。");
	}

	@Override
	protected void alerm() {
		// TODO Auto-generated method stub
		System.out.println("宝马鸣喇叭。。。");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马引擎燥起来。。。");
	}

	@Override
	protected boolean isAlerm() {
		// TODO Auto-generated method stub
		return false;
	}

}
