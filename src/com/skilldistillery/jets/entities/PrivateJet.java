package com.skilldistillery.jets.entities;

public class PrivateJet extends Jet implements CargoCarrier {

	public PrivateJet(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("PrivateJet", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void CargiCarrier() {
		// TODO Auto-generated method stub
		
	}

}

