package com.design.pattern.template;

public class RedHummer extends HummerMdole {

	private boolean alermFlag = true;

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("红色悍马开火。。。");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("红色悍马熄火。。。");
	}

	@Override
	protected void alerm() {
		// TODO Auto-generated method stub
		System.out.println("红色悍马鸣笛。。。");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("红色悍马引擎启动。。。");
	}

	@Override
	protected boolean isAlerm() {
		// TODO Auto-generated method stub
		return this.alermFlag;
	}

	public void setAlermFlag(boolean isAlerm) {
		this.alermFlag = isAlerm;
	}
}
