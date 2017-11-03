package com.design.pattern.buider;

import java.util.ArrayList;
import java.util.List;

public class Director {

	private List<String> sequence = new ArrayList<String>();

	public Director() {
	}

	public BMWModel getABMWModel() {
		this.sequence.clear();
		this.sequence.add(Component.ALERM);
		this.sequence.add(Component.START);
		this.sequence.add(Component.STOP);

		return (BMWModel) BMWBuilder.create().setSequence(sequence)
				.getCarmodel();
	}

	public BMWModel getBBMWModel() {
		this.sequence.clear();
		this.sequence.add(Component.START);
		this.sequence.add(Component.ALERM);
		this.sequence.add(Component.ENGINE);
		this.sequence.add(Component.STOP);

		return (BMWModel) BMWBuilder.create().setSequence(sequence)
				.getCarmodel();
	}

	public BenzModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add(Component.START);
		this.sequence.add(Component.ALERM);
		this.sequence.add(Component.ENGINE);
		this.sequence.add(Component.STOP);

		return (BenzModel) BenzBuilder.create().setSequence(sequence)
				.getCarmodel();
	}

	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add(Component.ALERM);
		this.sequence.add(Component.START);
		this.sequence.add(Component.STOP);

		return (BenzModel) BenzBuilder.create().setSequence(sequence)
				.getCarmodel();
	}

}
