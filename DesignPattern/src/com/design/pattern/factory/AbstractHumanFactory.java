package com.design.pattern.factory;

public abstract class AbstractHumanFactory {

	protected abstract <T extends Human> T createHuman(Class<T> clazz);

}
