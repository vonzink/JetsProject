package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String jetName, String model, double speed, int range, long price, long capacity, long payload) {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speed, int range, long price, int capacity, String payload) {
		super(model, speed, range, price, capacity, payload);
		// TODO Auto-generated constructor stub
	}

}
