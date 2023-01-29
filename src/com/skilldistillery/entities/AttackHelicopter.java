package com.skilldistillery.entities;

public class AttackHelicopter extends Jet {
	
	private String modelAircraft;
	private double speedAircraft;
	private int rangeAircraft;
	private long priceAircraft;

	public AttackHelicopter(String modelAircraft, double speedAircraft, int rangeAircraft, long priceAircraft) {
		super(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);
		this.modelAircraft = modelAircraft;
		this.speedAircraft = speedAircraft;
		this.rangeAircraft = rangeAircraft;
		this.priceAircraft = priceAircraft;
	}
}
