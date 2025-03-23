package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Jet;

public class Menu {

	private AirField airField = new AirField();
	
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		List<Jet> jets = airField.printJets(airField.getFileName());
		do {
		
			System.out.println("------------------------------------");
			System.out.println("          Choose an Option          ");
			System.out.println("------------------------------------");

			System.out.println("1. List fleet                       ");
			System.out.println("2. Fly all Jets                     ");
			System.out.println("3. View fastest Jets                ");
			System.out.println("4. View Jet with the longest range  ");
			System.out.println("5. Load all Cargo Jets              ");
			System.out.println("6. DogFight                         ");
			System.out.println("7. Add Jet to Fleet                 ");
			System.out.println("8. Remove a jet from Fleet          ");
			System.out.println("9. Quit                             ");
			System.out.println("------------------------------------");

			try {
				answer = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("invalid number, please enter a number");
				break; 
			}
			switch (answer) {

			case 1:
				System.out.println("	List fleet                      ");
				System.out.println("------------------------------------");
				for (Jet i : jets){
				System.out.println(i);
				}
				break;
			case 2:
				System.out.println("	Fly all jets                    ");
				System.out.println("------------------------------------");
				for (Jet i : jets){
					i.fly(); 
				}
				break;
			case 3:
				System.out.println("	       FASTEST JET              ");
				System.out.println("------------------------------------");
				Jet fastest = jets.get(0); 
				for (Jet i :jets){
					if(i.getSpeed() > fastest.getSpeed());
					fastest = i; 
				}
				System.out.println(fastest);
				break;
			case 4:
				System.out.println("	longest range                   ");
				System.out.println("------------------------------------");
				Jet range = jets.get(0); 
				for (Jet i :jets){
					if(i.getRange() > range.getRange());
					range = i; 
				}
				System.out.println(range);
				break;
			case 5:
				System.out.println("	all Cargo Jets                  ");
				System.out.println("------------------------------------");
				// make list of all subclass with the interface of CargoCarrier
				break;
			case 6:
				System.out.println("	Dogfight!                       ");
				System.out.println("------------------------------------");
				// need a fight menu
				// make a list of all subclass with the interface Combat Ready
				// create a random value to assign to each
				// display the winning score and plane
				break;
			case 7:
				System.out.println("	Add a jet to Fleet              ");
				System.out.println("------------------------------------");
				// call an Add method that will put information into the jetData.txt
				break;
			case 8:
				System.out.println("	Remove a jet from Fleet         ");
				System.out.println("------------------------------------");
				// call an Delete method that will pop information into the jetData.txt
				break;
			case 9:
				System.out.println("	Quit");
				// ends program
				break;
			default:
				System.out.println("Please enter an option");
			}

		} while (answer != 9);
		sc.close();
	}
}


