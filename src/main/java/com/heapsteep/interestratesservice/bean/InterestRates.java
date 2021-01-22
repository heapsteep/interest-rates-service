package com.heapsteep.interestratesservice.bean;

public class InterestRates {
	int home;
	public int getHome() {
		return home;
	}
	public void setHome(int home) {
		this.home = home;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	int motor;
	
	public InterestRates(int home, int motor) {
		this.home=home;
		this.motor=motor;
	}
}
