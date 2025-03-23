package com.skilldistillery.jets.entities;

public class ReconJet extends Jet implements CombatReady{

	public ReconJet(String jetName, String model, double speed, double range, long price, int capacity, long payload, String pilot) {
		super("ReconJet", jetName, model, speed, range, price, capacity, payload, pilot);
	}

	@Override
	public void fly() {
		 System.out.printf("%s %s clear for takeoff, speed: %.2f, range: %.2f, price: %d, flight time: %.2f hours %n", 
                 getJetName(), getModel(), getSpeed(), getRange(), getPrice(), getFlightTime());
	}
	
	@Override
	public void engageCombat() {
		// TODO Auto-generated method stub
		
	}

}
