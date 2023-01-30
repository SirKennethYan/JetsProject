package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {

	}

	public CargoPlane(String modelAircraft, double speedAircraft, int rangeAircraft, long priceAircraft) {
		super(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);
	}

	@Override
	public void loadAllCargo() {
		System.out.println(this.getModelAircraft() + " is loading cargo. ");
	}

	public void fly() {
		double time = this.getRangeAircraft() / this.getPriceAircraft();
		System.out.println("Aircraft Model: " + this.getModelAircraft() + ", Speed: " + this.getSpeedAircraft()
				+ " in MPH. Range: " + this.getRangeAircraft() + " in miles. ");
		System.out.println("This Air Craft will fly for " + Math.round(time) + " hours. ");
	}// Fly_Bracket

}
