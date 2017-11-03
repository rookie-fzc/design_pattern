package com.design.pattern.factory;

public class StaticHumanFactory {

	public static <T extends Human> T createHuman(Class<T> clazz) {
		Human human = null;

		try {
			human = (Human) clazz.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (T) human;
	}

}
