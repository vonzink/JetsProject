package com.skilldistillery.jets.entities;

public class ReconJet extends Jet implements CombatReady{

	public ReconJet(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("ReconJet", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}


}
