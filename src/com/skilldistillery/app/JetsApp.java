package com.skilldistillery.app;

import java.util.Scanner;
import com.skilldistillery.entities.*;

public class JetsApp {
	static AirField af;

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();

		ja.printMenu();
	}

//	User Story #4
	private static void printMenu() {
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
			listFleet();
			printMenu();
			userInput.nextLine();

		} else if (menuChoice.equals("2")) {
			viewFastestJets();
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
			quitApp();

		} else {
			System.out.println("Invalid input. Please enter a number between 1 and 4.");
			printMenu();

			userInput.close();
		}

	}// printMenu()

	private static void listFleet() {
		af.readJets();
	}

	private static void flyAllJets() {
		// TODO Auto-generated method stub

	}

	private static void viewFastestJets() {
		// TODO Auto-generated method stub

	}

	private static void viewJetLongestRange() {
		// TODO Auto-generated method stub

	}

	private static void loadAllCargo() {
		// TODO Auto-generated method stub

	}

	private static void dogFight() {
		// TODO Auto-generated method stub

	}

	private static void addJetToFleet() {
		// TODO Auto-generated method stub

	}

	private static void removeJetFromFleet() {
		// TODO Auto-generated method stub

	}

	private static void quitApp() {
		// TODO Auto-generated method stub

	}

}
