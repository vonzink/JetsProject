package com.skilldistillery.jets.app;

public class Menu {

	
	
	import java.util.Scanner; 
	
	
	
	public static Menu () {

		Scanner sc = new Scanner(System.in);



		System.out.println("1. List fleet"); 
		System.out.println("2. Fly All Jets"); 
		System.out.println("3. View all Jets"); 
		System.out.println("View Jet with the longest range"); 
		System.out.println("Load all Cargo Jets"); 
		System.out.println("DogFight"); 
		System.out.println("Add Jet to Fleet"); 
		System.out.println("Remove a jet from Fleet");
		System.out.println("Quit");
	
		int answer = sc.nextInt(); 
		switch (answer) {

		  case 1:
			  System.out.println("List fleet");
			  //SUDO: call the toString from Jet
			  
		    break;
		  case 2:
			  System.out.println("Fly all jets");
			  //SUDO: call fly method from jets
			  
		    break;
		  case 3:
			  System.out.println("View fastest jet");
			  //loop through an array of jets at speed at index 3 and find the largest number for the jet to print. 
			  break;
		  case 4:
			  System.out.println("View jet with longest range");
			//loop through an array of jets at speed at index 4 and find the largest number for the jet to print. 
			  break;
		  case 5:
			  System.out.println("Load all Cargo Jets");
			  //make list of all subclass with the interface of CargoCarrier
			  break;
		  case 6:
			  System.out.println("Dogfight!");
			  //need a fight menu
			  //make a list of all subclass with the interface Combat Ready
			  // create a random value to assign to each
			  //display the winning score and plane
			  break;
		  case 7:
			  System.out.println("Add a jet to Fleet");
			  //call an Add method that will put information into the jetData.txt
			  break;
		  case 8:
			  System.out.println("Remove a jet from Fleet");
			  //call an Delete method that will pop information into the jetData.txt
			  break;
		  case 9:
			  System.out.println("Quit");
			  //ends program
			  break;
		  default:
			  System.out.println("Please enter an option");

		}

	sc.close();
	
return; 
}
	
	
	
	