package com.design.pattern.buider;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用模板方法模式
 * 
 * @author dell
 * 
 */
public abstract class CarModel {

	private List<String> sequence = new ArrayList<>();

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

	// 将参数传进模板方法，控制基本方法的调用顺序
	public final void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}

	// 模板方法
	public final void run() {
		if (sequence.size() < 0) {
			System.out.println("汽车缺少零件");
			return;
		}
		for (int i = 0; i < sequence.size(); i++) {
			String action = sequence.get(i);
			switch (action) {
			case Component.START:
				this.start();
				break;
			case Component.STOP:
				this.stop();
				break;
			case Component.ENGINE:
				this.engineBoom();
				break;
			case Component.ALERM:
				if (isAlerm())
					this.alerm();
				break;

			}
		}
	}

}
