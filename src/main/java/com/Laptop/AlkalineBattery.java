package com.Laptop;

import org.springframework.stereotype.Component;

@Component
public class AlkalineBattery implements Battery{

	String batteryname = "AlkalineBattery";
	@Override
	public String getBatteryName() {
		return batteryname;
	}

}
