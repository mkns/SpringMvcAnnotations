package com.kennyscott.springmvctest1;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
public class VanBean extends VehicleBean implements IVehicleBean {

	public VanBean() {
		super();
		this.setType("van");
	}
	
}
