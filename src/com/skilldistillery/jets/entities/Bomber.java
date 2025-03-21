package com.skilldistillery.jets.entities;

public class Bomber extends Jet implements CombatReady {

	public Bomber(String jetName, String model, double speed, int range, long price, long capacity, long payload) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bomber(String model, double speed, int range, long price, int capacity, String payload) {
		super(model, speed, range, price, capacity, payload);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}

	
}
