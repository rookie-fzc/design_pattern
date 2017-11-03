package com.design.pattern.template;

public abstract class HummerMdole {
	// 开火
	protected abstract void start();

	// 刹车
	protected abstract void stop();

	// 鸣喇叭的动作用使用者控制 钩子函数
	protected boolean isAlerm() {
		return true;
	};

	// 鸣喇叭
	protected abstract void alerm();

	// 引擎会轰鸣
	protected abstract void engineBoom();

	// 动起来
	public final void run() {
		this.start();
		this.engineBoom();
		if (isAlerm()) {
			this.alerm();
		}
		this.stop();
	}

}
