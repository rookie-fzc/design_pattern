package com.design.pattern.factory;

public class HumanFactory extends AbstractHumanFactory {

	@Override
	protected <T extends Human> T createHuman(Class<T> clazz) {
		// TODO Auto-generated method stub
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
