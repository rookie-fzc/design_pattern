package com.design.pattern.buider;

import java.util.List;

public class BenzBuilder extends CarBuilder<BenzBuilder> {

	private BenzModel benzModel = new BenzModel();

	public static BenzBuilder instance;

	private BenzBuilder() {
	}

	@Override
	protected BenzBuilder setSequence(List<String> sequence) {
		// TODO Auto-generated method stub
		this.benzModel.setSequence(sequence);
		return instance;
	}

	public static BenzBuilder create() {
		if (instance == null) {
			instance = new BenzBuilder();
		}
		return instance;
	}

	@Override
	protected CarModel getCarmodel() {
		// TODO Auto-generated method stub
		return benzModel;
	}

}
