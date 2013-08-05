package com.kennyscott.springmvctest1;

import org.springframework.stereotype.Service;

@Service
public class CarBean extends VehicleBean implements IVehicleBean {

	public CarBean() {
		super();
		this.setType("car");
	}
}
