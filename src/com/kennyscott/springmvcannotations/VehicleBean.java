package com.kennyscott.springmvcannotations;

import java.util.UUID;

public abstract class VehicleBean implements IVehicleBean {

	private String make;
	private String model;
	private String randomValue;
	private String type;

	public VehicleBean() {
		this(generateRandomValue());
	}

	public VehicleBean(String randomValue) {
		setRandomValue(randomValue);
	}

	static String generateRandomValue() {
		return UUID.randomUUID().toString();
	}
	
	public String getRandomValue() {
		return randomValue;
	}

	public void setRandomValue(String randomValue) {
		this.randomValue = randomValue;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String getMake() {
		return make;
	}

	@Override
	public String getModel() {
		return model + " " + randomValue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
