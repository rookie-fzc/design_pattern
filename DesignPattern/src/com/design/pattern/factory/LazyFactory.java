package com.design.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public class LazyFactory {

	private static final Map<String, Human> preMap = new HashMap<String, Human>();

	public static synchronized Human createHuman(String type) {

		Human human = null;
		if (preMap.containsKey(type)) {
			human = preMap.get(type);
		} else {
			human = choseType(type);
			preMap.put(type, human);
		}
		return human;
	}

	private static Human choseType(String type) {
		if (type.equals(Type.YELLOW)) {
			return new YellowHuman();
		} else if (type.equals(Type.WHITE)) {
			return new WhiteHuman();
		} else {
			return new BlackHuman();
		}
	}

}
