package com.skilldistillery.jets.entities;

public class Bomber extends Jet implements CombatReady {

	public Bomber(String jetName, String model, double speed, int range, long price, int capacity, long payload) {
		super("Bomber", jetName, model, speed, range, price, capacity, payload);
	}

	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		System.out.println(getJetName() + " engaging in combat operations.");
	}

}

