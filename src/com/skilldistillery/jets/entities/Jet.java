package com.skilldistillery.jets.entities;

public abstract class Jet {

	private String model; 
	private double speed; 
	private int range;
	private long price;
	private int capacity; 
	private String payload; 
	
	public Jet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jet(String model, double speed, int range, long price, int capacity, String payload) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.capacity = capacity;
		this.payload = payload;
	}

	public void fly () {
		System.out.println("prints data");

	}
	
	
	public void getSpeedInMach() {
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
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return String.format(
				"Jet [model=%s, speed=%s, range=%s, price=%s, capacity=%s, payload=%s, getModel()=%s, getSpeed()=%s, getRange()=%s, getPrice()=%s, getCapacity()=%s, getPayload()=%s, getClass()=%s, hashCode()=%s, toString()=%s]",
				model, speed, range, price, capacity, payload, getModel(), getSpeed(), getRange(), getPrice(),
				getCapacity(), getPayload(), getClass(), hashCode(), super.toString());
	} 
	
	
	
	
}

