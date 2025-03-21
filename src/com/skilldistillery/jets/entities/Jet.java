package com.skilldistillery.jets.entities;

public abstract class Jet {

	private String classification; 
	private String jetName; 
	private String model; 
	private double speed; 
	private int range;
	private long price;
	private int capacity; 
	private long payload;
	public Jet() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	public Jet(String classification, String jetName, String model, double speed, int range, long price, int capacity,
			long payload) {
		super();
		this.classification = classification;
		this.jetName = jetName;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.capacity = capacity;
		this.payload = payload;
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
	public int getRange() {
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
	@Override
	public String toString() {
		return String.format(
				"Jet class: %s, jetName: %s, model: %s, speed: %s, range: %s, price: %s, capacity: %s, payload: %s",
				classification, jetName, model, speed, range, price, capacity, payload);
	} 
	
	
	
}