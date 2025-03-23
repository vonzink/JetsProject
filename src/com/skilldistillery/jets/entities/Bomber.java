package com.skilldistillery.jets.entities;



public class Bomber extends Jet implements CombatReady {

	public Bomber(String jetName, String model, double speed, double range, long price, int capacity, long payload, String pilot) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bomber(String classification, String jetName, String model, double speed, double range, long price,
			int capacity, long payload, String pilot, double flightTime) {
		super(classification, jetName, model, speed, range, price, capacity, payload, pilot);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fly() {
		 System.out.printf("%s %s clear for takeoff, speed: %.2f, range: %d, price: %d, flight time: %.2f hours %n", 
                 getJetName(), getModel(), getSpeed(), getRange(), getPrice(), getFlightTime());

	}
	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		System.out.println(getJetName() + " engaging in combat operations.");
	}

}

