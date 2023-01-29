package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
//	User Story #2
	private List<Jet> fleetOfJets;

	public AirField() {
		this.fleetOfJets = new ArrayList<>();

		String fileName = "jets.txt";
		this.fleetOfJets = readJets(fileName);
		printJets(fleetOfJets);
	}// Airfield()

	private void printJets(List<Jet> jetsToPrint) {
		for (Jet jet : jetsToPrint) {
			System.out.println(jet);
		}
	}// printJets()

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

	
//	public void showFastestJet() {
//
//	}

}// Class_Bracket
