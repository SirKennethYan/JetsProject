package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
//	User Story #2
	public List<Jet> fleetOfJets = new ArrayList<>();// An ArrayList to hold Strings

	public List<Jet> getFleetOfJets() {
		return fleetOfJets;
	}

	public void setfleetOfJets(List<Jet> fleetOfJets) {
		this.fleetOfJets = fleetOfJets;
	}

	public AirField() {
		String fileName = "jets.txt";
		fleetOfJets = readJets(fileName);

	}// Airfield()

//	User Story #3
	public List<Jet> readJets(String fileName) {

		List<Jet> allJets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				Jet jet = null;
				String[] splitJetData = line.split(", ");
				String type = splitJetData[0];
				String modelAircraft = splitJetData[1];
				double speedAircraft = Double.parseDouble(splitJetData[2]);
				int rangeAircraft = Integer.parseInt(splitJetData[3]);
				long priceAircraft = Long.parseLong(splitJetData[4]);

				if (type.equalsIgnoreCase("FighterJet")) {
					jet = new FighterJet(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);
				} else if (type.equalsIgnoreCase("CargoPlane")) {
					jet = new CargoPlane(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);
				} else if (type.equalsIgnoreCase("AttackHelicopter")) {
					jet = new AttackHelicopter(modelAircraft, speedAircraft, rangeAircraft, priceAircraft);

					allJets.add(jet);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return allJets;

	}// readJets()

	public void showListOfJets() {
		System.out.println(fleetOfJets);

	}

//	private static void showListOfJets() {
//
//		for (Jet fleet : fleetOfJets) {
//			if (fleet != null) {
//				System.out.println(fleetOfJets);
//			}
//
//		}
//

//	}// displayTrucks_Bracket


	public void fly() {
		for (Jet jet : fleetOfJets) {
			System.out.println(jet);
			jet.fly();
		}
	}

	public void showFastestJet() {
		Jet fastest = null;
		for (Jet jet : fleetOfJets) {
			if (fastest == null) {
				fastest = jet;
			} else if (jet.getSpeedAircraft() > fastest.getSpeedAircraft()) {
				fastest = jet;
			}
		}
		System.out.println("Fastest: " + fastest);
	}

	public Jet getLongestRange() {
		Jet topRangeJet = null;
		for (Jet jet : fleetOfJets) {
			if (topRangeJet.getRangeAircraft() < jet.getRangeAircraft()) {
				topRangeJet = jet;
			}
		}
		System.out.println(topRangeJet);
		return topRangeJet;

	}

}// Class_Bracket
