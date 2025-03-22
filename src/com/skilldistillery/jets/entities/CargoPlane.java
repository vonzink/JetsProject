package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("CargoPlane", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void CargiCarrier() {
		// TODO Auto-generated method stub
		
	}

}