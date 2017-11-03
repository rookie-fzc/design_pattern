package com.design.pattern.buider;

import java.util.List;

public class BMWBuilder extends CarBuilder<BMWBuilder> {

	private BMWModel bmwModel = new BMWModel();
	public static BMWBuilder instance;

	private BMWBuilder() {
	}

	@Override
	protected BMWBuilder setSequence(List<String> sequence) {
		// TODO Auto-generated method stub
		this.bmwModel.setSequence(sequence);
		return instance;
	}

	public static BMWBuilder create() {
		if (instance == null)
			instance = new BMWBuilder();
		return instance;
	}

	@Override
	protected CarModel getCarmodel() {
		// TODO Auto-generated method stub
		return bmwModel;
	}

}
