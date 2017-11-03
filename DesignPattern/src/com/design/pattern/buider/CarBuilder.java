package com.design.pattern.buider;

import java.util.List;

public abstract class CarBuilder<T> {

	protected abstract T setSequence(List<String> sequence);
	
	protected abstract CarModel getCarmodel();
	
}
