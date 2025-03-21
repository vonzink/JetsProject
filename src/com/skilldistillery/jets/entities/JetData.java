package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JetData {

	String fileName = "jetData.txt";  //field

	public static void main(String[] args) {   //main
		JetData jetData = new JetData(); //construction
		List<Jet> listOfJets = jetData.printJets(jetData.fileName); //creates an lisst of jets from date i passed into it from file name. 

		// print out the jets
		for (Jet j : listOfJets) { 
			System.out.println(j);
		}
	}

	public List<Jet> printJets(String fileName) {
		List<Jet> jets = new ArrayList<>(); 
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) { //reads the date in the file. 
			String line; //creates a variable

			while ((line = bufIn.readLine()) != null) { //continues while there is data
				String[] fields = line.split(","); //creates an array fields and indexes them based on where the commas are
				String classification = fields[0]; 
				String jetName = fields[1];
				String model = fields[2];
				double speed = Double.parseDouble(fields[3]);
				int range = Integer.parseInt(fields[4]);
				long price = Long.parseLong(fields[5]);
				long capacity = Long.parseLong(fields[6]);
				long payload = Long.parseLong(fields[7]);
				
				Jet j = null; 
				
				switch (classification) {
                case "B":
                    j = new Bomber(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "C":
                    j = new CargoPlane(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "M":
                    j = new CommercialJet(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "D":
                    j = new Drone(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "F":
                    j = new FighterJet(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "I":
                    j = new Interceptor(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "P":
                    j = new PrivateJet(jetName, model, speed, range, price, capacity, payload);
                    break;
                case "R":
                    j = new ReconJet(jetName, model, speed, range, price, capacity, payload);
                    break;
                default:
                    System.out.println("Unknown classification: " + classification);
                    break;
            }
            if (j != null) {
                jets.add(j);
            }
		}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets; // Return the list of jets
}

	
	
}




