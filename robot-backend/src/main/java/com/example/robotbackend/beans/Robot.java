package com.example.robotbackend.beans;

import org.springframework.stereotype.Component;

@Component
public class Robot {
	public  static final int MAX_WEIGHT = 15;
	public static final int BATTERY_CAPACITY = 7;
	public static final double BATTERY_THRESHOLD = 0.2;

    private int walkedDistance;
    private int carryingWeight;
    private double batteryLevel;
	public int getWalkedDistance() {
		return walkedDistance;
	}
	public void setWalkedDistance(int walkedDistance) {
		this.walkedDistance = walkedDistance;
	}
	public int getCarryingWeight() {
		return carryingWeight;
	}
	public void setCarryingWeight(int carryingWeight) {
		this.carryingWeight = carryingWeight;
	}
	public double getBatteryLevel() {
		return batteryLevel;
	}
	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	@Override
	public String toString() {
		return "Robot [walkedDistance=" + walkedDistance + ", carryingWeight=" + carryingWeight + ", batteryLevel="
				+ batteryLevel + "]";
	}
	public Robot(int walkedDistance, int carryingWeight, double batteryLevel) {
		super();
		this.walkedDistance = walkedDistance;
		this.carryingWeight = carryingWeight;
		this.batteryLevel = 1.0;
	}

}
