package com.skilldistillery.app;

import java.util.Scanner;

import com.skilldistillery.entities.AirField;
import com.skilldistillery.entities.CargoPlane;
import com.skilldistillery.entities.FighterJet;

public class JetsApp {
	public static void main(String[] args) {
		JetsApp ja = new JetsApp();

		ja.printMenu();
	}

	private void printMenu() {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Welcome to the Jets App! Choose a selection from the list below.");
		System.out.println("MENU:");
		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with longest range");
		System.out.println("5: Load all Cargo Jets");
		System.out.println("6: Dogfight!");
		System.out.println("7: Add a jet to Fleet");
		System.out.println("8: Remove a jet from Fleet");
		System.out.println("9: Quit");

		String menuChoice = userInput.nextLine();

		if (menuChoice.equals("1")) {
			showListOfJets();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("2")) {
			fly();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("3")) {
			viewFastestJets();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("4")) {
			viewJetLongestRange();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("5")) {
			loadAllCargo();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("6")) {
			dogFight();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("7")) {
			addJetToFleet();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("8")) {
			removeJetFromFleet();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("9")) {
			System.out.println("Goodbye! ");

		} else {
			System.out.println("Invalid input. Enter a number between 1 and 9. ");
			printMenu();

			userInput.close();
		}

	}// printMenu()

	private void showListOfJets() {
		AirField af = new AirField();
		af.showListOfJets();
	}

	private void fly() {
		AirField af = new AirField();
		af.fly();

	}

	private void viewFastestJets() {
		AirField af = new AirField();
		af.showFastestJet();

	}

	private void viewJetLongestRange() {
		AirField af = new AirField();
		af.showLongestRange();

	}

	private void loadAllCargo() {
		CargoPlane cp = new CargoPlane();
		cp.loadAllCargo();

	}

	private void dogFight() {
		FighterJet fj = new FighterJet();
		fj.dogFight();

	}

	private void addJetToFleet() {
		AirField af = new AirField();
		af.addJetToFleet();

	}

	private void removeJetFromFleet() {
		AirField af = new AirField();
		af.removeJetFromFleet();

	}

}
