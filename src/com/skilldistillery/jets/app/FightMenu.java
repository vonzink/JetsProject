package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.Jet;

public class FightMenu {
	AirField airField = new AirField();
	Scanner sc = new Scanner(System.in);
	List<Jet> jets = airField.printJets(airField.getFileName());
	private Jet chosen;
	int answer = 0;

	public void fightMenu() {
		System.out.println("Welcome to Combat, please choose your plane");
		int answer = 0;

		do {
			System.out.println("------------------------------------");
			System.out.println("          Choose Your Plane         ");
			System.out.println("------------------------------------");
			System.out.println("1. LIST COMBAT PLANES				");
			System.out.println("2. ADD A PLANE			            ");
			System.out.println("3. CHOOSE YOUR PLANE FOR BATTLE     ");
			System.out.println("4. RETURN TO MAIN MENU              ");
			System.out.println("9. Quit                             ");
			System.out.println("------------------------------------");

			try {
				answer = sc.nextInt();
			} catch (Exception e) {
				System.err.println("Invalid number, please enter a number");
				sc.nextLine();
				continue;
			}

			switch (answer) {
			case 1:
				System.out.println("           LIST COMBAT PLANES       ");
				System.out.println("------------------------------------");
				for (Jet i : jets) {
					if (i instanceof CombatReady) {
						System.out.println(i);
					}
				}
				break;
			case 2:
				System.out.println("          ADD A PLANE     ");
				System.out.println("------------------------------------");
				AddToAirField addToAirField = new AddToAirField();
				addToAirField.addToAirField();

				break;
			case 3:
			    System.out.println("         CHOOSE YOUR PLANES       ");
			    System.out.println("------------------------------------");
			    List<Jet> combatPlanes = new ArrayList<>();
			    int index = 1;
			    for (Jet i : jets) {
			        if (i instanceof CombatReady) {
			            System.out.println(index + ": " + i);
			            combatPlanes.add(i);
			            index++;
			        }
			    }
			    System.out.println("Enter the number of the plane you would like to use:");
			    int selection = 0;
			    try {
			        selection = sc.nextInt();
			    } catch (Exception e) {
			        System.err.println("Please enter a valid number.");
			        sc.nextLine();
			        break;
			    }
			  
			    chosen = combatPlanes.get(selection - 1);
			    Battle battle = new Battle();
			    battle.startBattle(chosen);
			    
			case 4:
				System.out.println("       RETURN TO MAIN MENU          ");
				System.out.println("------------------------------------");

				Menu menu = new Menu();
				menu.displayMenu();

				break;
			case 9:
				System.out.println("Quit");
				break;
			default:
				System.out.println("Please enter a valid option");
			}

		}while(answer!=9);
}}