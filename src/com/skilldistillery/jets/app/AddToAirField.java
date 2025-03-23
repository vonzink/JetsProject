package com.skilldistillery.jets.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddToAirField {

	public void addToAirField() {
		Scanner sc = new Scanner(System.in);
		int answer = 0; 
		String classification = "";
		String jetName = ""; 
		String model = ""; 
		String speed = ""; 
		String range = "";
		String price = "";
		String capacity = "";
		String payload = "";
		String pilot = "";

		System.out.println("           ADD A JET                ");
		System.out.println("------------------------------------");


	            System.out.println("------------------------------------");
	            System.out.println("         Enter Classification:        ");
	            System.out.println("------------------------------------");
	            System.out.println("1. Bomber");
	            System.out.println("2. CargoPlane");
	            System.out.println("3. Commerical Jet");
	            System.out.println("4. Drone");
	            System.out.println("5. FighterJet");
	            System.out.println("6. Interceptor");
	            System.out.println("7. Private Jet");
	            System.out.println("8. Recon Jet");
	            System.out.println("------------------------------------");

	            try {
	                answer = sc.nextInt();
	            } catch (Exception e) {
	                System.err.println("Invalid number, please enter a number");
	                sc.nextLine();
	            }
	            switch (answer) {
	                case 1:
	                	classification = ("Bomber");        
	                    break;
	                case 2:
	                	classification = ("CargoPlane");    
	                    break;
	                case 3:
	                	classification = ("CommercialJet");
	                    break;
	                case 4:
	                	classification = ("Drone");    
	                    break;
	                case 5:
	                	classification = ("FighterJet");	
	                	break;
	                case 6:
	                	classification = ("Interceptor");     	
	                	break;
	                case 7:
	                	classification = ("Private Jet");
	                	break;
	                case 8:
	                	classification = ("Recon Jet"); 
	                    break;
	                default:
	                    System.out.println("Please enter a valid option");
	            }
	    sc.nextLine(); 
		System.out.println("Enter Jet Name: ");
		jetName = sc.nextLine();
		System.out.println("Enter Model: ");
		model = sc.nextLine();
		System.out.println("Enter Speed in MPH: ");
		speed = sc.nextLine();
		System.out.println("Enter Range: ");
		range = sc.nextLine();
		System.out.println("Enter Price: ");
		price = sc.nextLine();
		System.out.println("Enter Capacity: ");
		capacity = sc.nextLine();
		System.out.println("Enter Payload: ");
		payload = sc.nextLine();
		System.out.println("Enter Pilots Name: ");
		pilot = sc.nextLine();
		String newLine = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", classification, jetName, model, speed, range,
				price, capacity, payload, pilot);
	
		try {
			FileWriter fw = new FileWriter("jetData.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(newLine);
			pw.close();
			System.out.println("Jet added successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}