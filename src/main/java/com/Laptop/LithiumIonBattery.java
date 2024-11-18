package com.Laptop;

import org.springframework.stereotype.Component;

//@Component
public class LithiumIonBattery implements Battery {

	String batteryname = "LithiumIonBattery";
	@Override
	public String getBatteryName() {
		return batteryname;
	}

}
