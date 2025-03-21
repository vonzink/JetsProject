package com.skilldistillery.jets.entities;

public class CommercialJet extends Jet implements CargoCarrier {

	public CommercialJet(String jetName, String model, double speed, int range, long price, int capacity,
			long payload) {
		super("CommercialJet", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void CargiCarrier() {
		// TODO Auto-generated method stub
		
	}

}

