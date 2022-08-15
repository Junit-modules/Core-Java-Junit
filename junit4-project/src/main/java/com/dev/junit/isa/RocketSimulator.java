package com.dev.junit.isa;

public class RocketSimulator {

	private RocketService rocketService;
	
	public RocketSimulator(RocketService rocketService) {
		this.rocketService = rocketService;
	}
	
	public String getRocketType(Rocket rocket) {
		return this.rocketService.getRocketService(rocket);
	}
}
