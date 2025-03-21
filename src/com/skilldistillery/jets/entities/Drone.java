package com.skilldistillery.jets.entities;

public class Drone extends Jet implements CombatReady{

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}

	public Drone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drone(String model, double speed, int range, long price, int capacity, String payload) {
		super(model, speed, range, price, capacity, payload);
		// TODO Auto-generated constructor stub
	}

	public Drone(String jetName, String model, double speed, int range, long price, long capacity, long payload) {
		// TODO Auto-generated constructor stub
	}

}
