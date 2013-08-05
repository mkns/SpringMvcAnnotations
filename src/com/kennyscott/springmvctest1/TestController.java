package com.kennyscott.springmvctest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@Autowired
	IVehicleBean carBean;

	@Autowired
	IVehicleBean vanBean;

	@RequestMapping("/test")
	public String helloWorld(Model model) {

		carBean.setMake("Ford");
		carBean.setModel("Galaxy");
		model.addAttribute("carBean",carBean);
		
		vanBean.setMake("Renault");
		vanBean.setModel("Magoo");
		model.addAttribute("vanBean", vanBean);

		return "test";
	}

	public IVehicleBean getVanBean() {
		return vanBean;
	}

	public void setVanBean(IVehicleBean vanBean) {
		this.vanBean = vanBean;
	}

	public IVehicleBean getCarBean() {
		return carBean;
	}

	public void setCarBean(IVehicleBean carBean) {
		this.carBean = carBean;
	}

}
