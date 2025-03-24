package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entities.CargoCarrier;
import com.skilldistillery.jets.entities.Jet;

public class Menu {

	private AirField airField = new AirField();

	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		List<Jet> jets = airField.printJets(airField.getFileName());
		do {

			System.out.println("------------------------------------");
			System.out.println("   |      Choose an Option      |    ");
			System.out.println("------------------------------------");

			System.out.println("1. LIST FLEET                       ");
			System.out.println("2. FLY ALL JETS     	            ");
			System.out.println("3. FASTEST JET		                ");
			System.out.println("4. LONGEST RANGE				    ");
			System.out.println("5. LOAD ALL CARGO JETS              ");
			System.out.println("6. DOGFIGHT!!                       ");
			System.out.println();
			System.out.println("7. Add Jet to Fleet                 ");
			System.out.println("8. Remove a jet from Fleet          ");
			System.out.println();
			System.out.println("9. Quit                             ");
			System.out.println("------------------------------------");

			try {
				answer = sc.nextInt();
			} catch (Exception e) {
				System.err.println("invalid number, please enter a number");
				break;
			}
			switch (answer) {

			case 1:
				System.out.println("	          LIST FLEET            ");
				System.out.println("------------------------------------");
				for (Jet i : jets) {
					System.out.println(i);
				}
				break;
			case 2:
				System.out.println("	        FLY ALL JETS            ");
				System.out.println("------------------------------------");
				for (Jet i : jets) {
					i.fly();
				}
				break;
			case 3:
				System.out.println("	       FASTEST JET              ");
				System.out.println("------------------------------------");
				Jet fastest = jets.get(0);
				for (Jet i : jets) {
					if (i.getSpeed() > fastest.getSpeed()) {
						fastest = i;
					}
				}
				System.out.println(fastest);
				break;
			case 4:
				System.out.println("	      LONGEST RANGE             ");
				System.out.println("------------------------------------");
				Jet range = jets.get(0);
				for (Jet i : jets) {
					if (i.getRange() > range.getRange()) {
						range = i;
					}
				}
				System.out.println(range);
				break;
			case 5:
				System.out.println("	    LIST ALL CARGO JETS         ");
				System.out.println("------------------------------------");
				for (Jet i : jets) {
					if (i instanceof CargoCarrier) {
						System.out.println(i);
					}
				}
				break;
			case 6:
				System.out.println("	         DOGFIGHT!!             ");
				System.out.println("------------------------------------");

				FightMenu fm = new FightMenu();  
				fm.fightMenu(); 

				break;
			case 7:
				System.out.println("	        ADD A JET               ");
				System.out.println("------------------------------------");
				AddToAirField addToAirField = new AddToAirField(); 
				addToAirField.addToAirField(); 
				
				break;
			case 8:
				System.out.println("	       REMOVE A JET             ");
				System.out.println("------------------------------------");
				DeleteFromAirField deleteFromAirField = new DeleteFromAirField(); 
				deleteFromAirField.deleteFromAirField(); 
				break;
			case 9:
				System.out.println("	Quit      ");
				// ends program
				break;
			default:
				System.out.println("Please enter an option");
			}

		} while (answer != 9);
		sc.close();
	}
}
