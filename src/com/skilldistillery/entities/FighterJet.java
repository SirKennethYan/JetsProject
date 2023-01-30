package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {

	}

	public FighterJet(String modelAircraft, double speedAircraft, int rangeAircraft, long priceAircraft) {
		super(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);
	}

	@Override
	public void dogFight() {
		System.out.println(this.getModelAircraft() + " is engaging in Air-to-Air combat!!! ");
	}

	public void fly() {
		double time = this.getRangeAircraft() / this.getSpeedAircraft();
		System.out.println("Aircraft Model: " + this.getModelAircraft() + ", Speed: " + this.getSpeedAircraft()
				+ " in MPH. Range: " + this.getRangeAircraft() + " in miles. ");
		System.out.println("This Air Craft will fly for " + Math.round(time) + " hours. ");
	}// Fly_Bracket

}
