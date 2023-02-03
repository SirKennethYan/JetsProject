package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private ArrayList<Jet> fleetOfJets = new ArrayList<>();// An ArrayList to hold Strings

	public ArrayList<Jet> getFleetOfJets() {
		return fleetOfJets;
	}

	public void setFleetOfJets(ArrayList<Jet> fleetOfJets) {
		this.fleetOfJets = fleetOfJets;
	}

	public AirField() {
		String fileName = "jets.txt";
		readJets(fileName);

	}// Airfield()

	public List<Jet> readJets(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				Jet jet = null;
				String[] splitJetData = line.split(",");
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

				}
				fleetOfJets.add(jet);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleetOfJets;

	}// readJets()

	public void showListOfJets() {
		System.out.println(fleetOfJets.size());
		for (Jet jet : fleetOfJets) {

			System.out.println(jet);
		}

	}

	public void loadAllCargo() {
		for (Jet jet : fleetOfJets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadAllCargo();
			}
		}
	}

	public void dogFight() {
		for (Jet jet : fleetOfJets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).dogFight();
			} else if (jet instanceof AttackHelicopter) {
				((AttackHelicopter) jet).dogFight();
			}
		}
	}
	
	

	public void fly() {
		for (Jet jet : fleetOfJets) {
			double time = jet.getRangeAircraft() / jet.getSpeedAircraft();
			System.out.println("Aircraft Model: " + jet.getModelAircraft() + " Speed: " + jet.getSpeedAircraft()
					+ " MPH. Range: " + jet.getRangeAircraft() + " Miles. ");
			System.out.println(jet.getModelAircraft() + " will fly for " + Math.round(time) + " hours. ");
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

	public Jet showLongestRange() {
		Jet topRangeJet = fleetOfJets.get(0);
		for (Jet jet : fleetOfJets) {
			if (topRangeJet.getRangeAircraft() < jet.getRangeAircraft()) {
				topRangeJet = jet;
			}
		}
		System.out.println(topRangeJet);
		return topRangeJet;

	}

	public void addJetToFleet(Scanner userInput) {
		try {
			System.out.print("Enter the Jets model: ");
			String model = userInput.next();
			System.out.print("Enter the Jets speed: ");
			double speed = userInput.nextDouble();
			System.out.print("Enter the Jets range: ");
			int range = userInput.nextInt();
			System.out.print("Enter the Jets price: ");
			long price = userInput.nextLong();

			fleetOfJets.add(new JetImpl(model, speed, range, price));
			System.out.println("Jet added to fleet!!! ");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input: ");
		}
	}

	public void removeJetFromFleet(Scanner userInput) {

		for (int i = 0; i < fleetOfJets.size(); i++) {
			System.out.println(i + 1 + ". " + fleetOfJets.get(i));
		}

		System.out.print("Select the number of the Jets to delete: ");
		try {
			int choice = userInput.nextInt();
			if (choice < fleetOfJets.size() + 1 && choice > 0) {
				System.out.println(fleetOfJets.get(choice - 1).getModelAircraft() + " deleted!!! ");
				fleetOfJets.remove(choice - 1);
			} else {
				System.out.println("Not a valid choice");
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input: ");
		}
	}

}// Class_Bracket
