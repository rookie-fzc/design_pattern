package com.design.pattern.buider;

public class BenzModel extends CarModel {

	private boolean isAlermFlag = true;

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("奔驰开火。。。");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("奔驰熄火。。。");
	}

	@Override
	protected void alerm() {
		// TODO Auto-generated method stub
		System.out.println("奔驰鸣喇叭。。。");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("奔驰引擎燥起来。。。");
	}

	@Override
	protected boolean isAlerm() {
		// TODO Auto-generated method stub
		return this.isAlermFlag;
	}

	public void setAlermFlag(boolean isAlerm) {
		this.isAlermFlag = isAlerm;
	}
}
