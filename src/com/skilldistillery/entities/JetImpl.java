package com.skilldistillery.entities;

public class JetImpl extends Jet {

	public JetImpl() {

	}

	public JetImpl(String modelAircraft, double speedAircraft, int rangeAircraft, long priceAircraft) {
		super(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);

	}

	public void fly() {
		double time = this.getRangeAircraft() / this.getPriceAircraft();
		System.out.println("Aircraft Model: " + this.getModelAircraft() + ", Speed: " + this.getSpeedAircraft()
				+ " in MPH. Range: " + this.getRangeAircraft() + " in miles. ");
		System.out.println("This Air Craft will fly for " + Math.round(time) + " hours. ");
	}// Fly_Bracket

}
