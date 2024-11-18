package com.Laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Laptop {
	
	String brand = "Asus";
	
	@Autowired
	Battery battery;
	void getDetails() {
		System.out.println(brand+"-"+battery.getBatteryName());
	}

}
