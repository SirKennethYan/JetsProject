package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String modelAircraft, double speedAircraft, int rangeAircraft, long priceAircraft) {
		super(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);
		
//	private String modelAircraft;
//	private double speedAircraft;
//	private int rangeAircraft;
//	private long priceAircraft;

//		this.modelAircraft = modelAircraft;
//		this.speedAircraft = speedAircraft;
//		this.rangeAircraft = rangeAircraft;
//		this.priceAircraft = priceAircraft;
	}

	public void dogFight() {
		
	}

	@Override
	public void fly() {
		double time = rangeAircraft / speedAircraft;
		System.out.println("Aircraft Model: " + modelAircraft + 
							", Speed: " + speedAircraft + 
							" in MPH. Range: " + rangeAircraft + " in miles. ");
		System.out.println("This Air Craft will fly for " + Math.round(time) + " hours. ");
	}// Fly_Bracket

}