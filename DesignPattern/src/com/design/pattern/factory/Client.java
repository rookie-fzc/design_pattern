package com.design.pattern.factory;
/**
 * 
 * @author dell
 * 作为生产的管理者，只知道生产什么就可以了，而不需要知道事务的具体信息。
 * 工厂方法模式
 * 定义：
 * 	定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 * 优点：
 * 	1.良好的封装性，清晰的代码结构，降低了模块间的耦合
 * 	2.屏蔽产品类的实现过程。由于产品的实例化工作是有工厂类实现的
 * 	3.典型的解耦框架。即高层模块只需要知道产品的抽象类，不需要知道具体的实现类。
 * 使用场景：
 * 	1.生成一个灵活的，可扩展的框架时；
 * 工厂方法模式的扩展：
 * 	1.静态工厂模式，即通过静态方法，创建一个对象；
 * 	2.多工厂方法模式：即每一个产品都对应一个子工厂，然后增加一个协调器，避免调用者与各个子工厂交流。协调类是封装各个子工厂，对高层模块提供统一的接口。
 * 	3.单例工厂：当符合构造器(private)
 * 	4.延迟初始化：创建一个对象，并使用Map变量产生一个缓存，对需要再次被重用的对象进行缓存。降低了对象的产生与销毁带来的复杂性。
 * 	  何为延迟初始化？一个对象被消费完毕后，并不立刻释放，工厂类保持其初始化状态，等待再次被使用。
 * 
 */
public class Client {
	
	public static void main(String[] args) {
		
		AbstractHumanFactory factory = new HumanFactory();
		Human whiteHuman;
		Human blackHuman;
		Human yellowHuman;
//		System.out.println("火候不到，生成了白种人");
//		whiteHuman = factory.createHuman(WhiteHuman.class);
//		whiteHuman.getColor();
//		whiteHuman.talk();
//		System.out.println("火候过了，生成了黑种人");
//		blackHuman = factory.createHuman(BlackHuman.class);
//		blackHuman.getColor();
//		blackHuman.talk();
//		System.out.println("火候正好，生成了黄种人");
//		yellowHuman = factory.createHuman(YellowHuman.class);
//		yellowHuman.getColor();
//		yellowHuman.talk();
		
		
		System.out.println("火候不到，生成了白种人");
		 whiteHuman = LazyFactory.createHuman(Type.WHITE);
		whiteHuman.getColor();
		whiteHuman.talk();
		System.out.println("火候过了，生成了黑种人");
		blackHuman = LazyFactory.createHuman(Type.BLACK);
		blackHuman.getColor();
		blackHuman.talk();
		System.out.println("火候正好，生成了黄种人");
		 yellowHuman = LazyFactory.createHuman(Type.YELLOW);
		yellowHuman.getColor();
		yellowHuman.talk();
		
	}

}
