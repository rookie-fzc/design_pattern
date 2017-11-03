package com.design.pattern.template;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * @author dell
 * 什么是模板方法模式？
 *    定义一个操作中的算法的框架，而将一些步骤按顺序延迟到子类实现。使得子类可以不改变一个算法的结构即可重定义改算法的某些特定步骤。
 * 基本方法：(abstract)
 *    也叫基本操作，由子类实现的方法，并且在模板方法中被调用。
 * 模板方法：(final)
 * 	  实现对基本方法的调用，完成固定的逻辑。
 * 钩子函数：
 * 	 钩子函数的返回值能够影响模板方法的执行结构
 * 使用场景：
 * 	1.多个子类有共有的方法，并且逻辑基本相同时；
 * 	2.重复和复杂的算法，把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现；
 * 	3.重构时，将相同的代码抽取到父类中，通过钩子函数(Hook Method)约束行为。
 */

public class Client {

	 static HummerMdole hummer ; 
	
	public static void main(String[] args) throws Exception{
		System.out.println("----------红色悍马-----------");
		System.out.println("红色悍马是否需要喇叭声响？ 0-不需要 ； 1-需要");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		hummer = new RedHummer();
		if(type.equals("0")){
			((RedHummer) hummer).setAlermFlag(true);
		}
		hummer.run();
		System.out.println("----------绿色悍马-----------");
		hummer = new BlueHummer();
		hummer.run();
		
	}
	
}
