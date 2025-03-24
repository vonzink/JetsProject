package com.skilldistillery.jets.entities;



public class Bomber extends Jet implements CombatReady {


	
	

	public Bomber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bomber(String jetName, String model, double speed, double range, long price, int armor, long payload, String pilot) {
	    super("Bomber", jetName, model, speed, range, price, armor, payload, pilot);
	}

	@Override
	public void fly() {
		 System.out.printf("%s %s clear for takeoff, speed: %.2f, range: %.2f, price: %d, flight time: %.2f hours %n", 
                 getJetName(), getModel(), getSpeed(), getRange(), getPrice(), getFlightTime());

	}
	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		System.out.println(getJetName() + " engaging in combat operations.");
	}

}

