package com.skilldistillery.jets.entities;

public class Drone extends Jet implements CombatReady{

	public Drone(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("Drone", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}

}

