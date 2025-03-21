package com.skilldistillery.jets.entities;

public class Interceptor extends Jet implements CombatReady {

	public Interceptor(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("Interceptor", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}


}

