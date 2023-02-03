package com.skilldistillery.app;

import java.util.Scanner;

import com.skilldistillery.entities.AirField;
import com.skilldistillery.entities.CargoPlane;
import com.skilldistillery.entities.FighterJet;

public class JetsApp {
	private Scanner userInput = new Scanner(System.in);
	private AirField af = new AirField();

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.printMenu();
	}

	private void printMenu() {

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
			viewListOfJets();
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

		}
		userInput.close();

	}// printMenu()

	private void viewListOfJets() {
		af.showListOfJets();
	}

	private void fly() {
		af.fly();
	}

	private void viewFastestJets() {
		af.showFastestJet();
	}

	private void viewJetLongestRange() {
		af.showLongestRange();
	}

	private void loadAllCargo() {
		af.loadAllCargo();
	}

	private void dogFight() {
		af.dogFight();
	}

	private void addJetToFleet() {
		af.addJetToFleet(userInput);
	}

	private void removeJetFromFleet() {
		af.removeJetFromFleet(userInput);
	}

}
