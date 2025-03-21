package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("FighterJet", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}

	

	
}

