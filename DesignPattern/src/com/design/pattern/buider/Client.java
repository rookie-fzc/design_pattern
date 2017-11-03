package com.design.pattern.buider;
/**
 * 
 * @author dell
 * 建设者模式定义：
 * 	将一个复杂对象的创建和它的表示分离，使用同样的构建过程可以创建不同的表示。
 * 组成：
 * 	Product:产品类，通常是实现了模板方法模式，即有模板方法和基本方法
 * 	Builder抽象创建者：规范产品的组建，有子类实现
 * 	ConcreteBuidler:具体建设者，实现抽象类中的所有方法，并返回一个组建好的对象
 * 	Director:导演类，负责安排已有模块的顺序，然后告诉Builder开始创建。
 * 使用场景：
 * 	1.相同的方法，不同的执行顺序，产生不同的事件结果时；
 * 	2.多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又是不相同的；
 * 	3.产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能时；
 * 总结：建设者模式关心的是零件的组装顺序。
 * 	建设者模式的核心：零件的组装顺序不同，产生的对象的效能也不同。就像玩积木，许多零件按照不同的顺序进行拼接，搭出来的形状也是不一样的。
 * 问题：
 * 	如果对象使用的零件是不同的，但是产生的效能是一样的，这能用建设者模式吗？
 */
public class Client {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		for(int i = 1 ; i < 21 ; i ++){
			System.out.println("A 模型的奔驰创建"+i+"辆");
			director.getABenzModel().run();
		}
		for(int i = 1 ; i <21 ; i ++){
			System.out.println("B 模型的奔驰创建"+i+"辆");
			director.getBBenzModel().run();
		}
		for(int i = 1 ; i < 21; i ++){
			System.out.println("A 模型的宝马创建"+i+"辆");
			director.getABMWModel().run();
		}

	}
	
	
}
