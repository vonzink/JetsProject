package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, double speed, int range, long price, int capacity, String payload) {
		super(model, speed, range, price, capacity, payload);
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String jetName, String model, double speed, int range, long price, long capacity, long payload) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}

	
}
