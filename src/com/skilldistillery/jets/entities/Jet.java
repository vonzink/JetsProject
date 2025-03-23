package com.skilldistillery.jets.entities;

public abstract class Jet {

	private String classification; 
	private String jetName; 
	private String model; 
	private double speed; 
	private double range;
	private long price;
	private int capacity; 
	private long payload;
	private String pilot; 
	private double flightTime; 
	
	public Jet() {
		super();	

	}
	public Jet(String classification, String jetName, String model, double speed, double range, long price,
	    int capacity, long payload, String pilot) {
	    this.classification = classification;
	    this.jetName = jetName;
	    this.model = model;
	    this.speed = speed;
	    this.range = range;
	    this.price = price;
	    this.capacity = capacity;
	    this.payload = payload;
	    this.pilot = pilot;
	}
	
	public void fly() {
		System.out.println("clear for takeoff!");
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getJetName() {
		return jetName;
	}
	public void setJetName(String jetName) {
		this.jetName = jetName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public long getPayload() {
		return payload;
	}
	public void setPayload(long payload) {
		this.payload = payload;
	}
	public double getFlightTime() {
		flightTime = (getRange() / getSpeed()); 
		return flightTime;
	}
	public void setFlightTime(double flightTime) {
		this.flightTime = flightTime;
	} 
	
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	@Override
	public String toString() {
		return String.format(
				"Jet Type: %s%n	Jet Name: %s,%n 	model: %s%n	Speed: %s MPH%n	Range: %s mile%n	Price: $%s%n	Capacity: %s lbs%n	Payload: %s lbs%n Pilot: %s%n",
				classification, jetName, model, speed, range, price, capacity, payload, pilot);
	
	}
	
}