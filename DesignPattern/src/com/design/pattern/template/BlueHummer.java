package com.design.pattern.template;

public class BlueHummer extends HummerMdole{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("绿色悍马开火。。。");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("绿色悍马熄火。。。");
	}

	@Override
	protected void alerm() {
		// TODO Auto-generated method stub
		System.out.println("绿色悍马鸣喇叭。。。");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("绿色悍马启动引擎。。。");
	}
	@Override
	protected boolean isAlerm() {
		// TODO Auto-generated method stub
		return false;
	}

}
