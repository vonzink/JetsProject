/*package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JetData {

	private String fileName = "jetData.txt"; // field

	public List<Jet> printJets(String fileName) {
		List<Jet> jets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line; // creates a variable
			Jet j = null;

			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				for (int i = 0; i < fields.length; i++) {
					String classification = fields[i];
					String jetName = fields[i];
					String model = fields[i];
					double speed = Double.parseDouble(fields[i]);
					int range = Integer.parseInt(fields[i]);
					long price = Long.parseLong(fields[i]);
					int armor = Integer.parseInt(fields[i]);
					long payload = Long.parseLong(fields[i]);
					String pilot = fields[i]; 


					switch (classification) {
					case "Bomber":
						j = new Bomber(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "CargoPlane":
						j = new CargoPlane(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "CommercialJet":
						j = new CommercialJet(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "Drone":
						j = new Drone(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "FighterJet":
						j = new FighterJet(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "Interceptor":
						j = new Interceptor(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "PrivateJet":
						j = new PrivateJet(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					case "ReconJet":
						j = new ReconJet(jetName, model, speed, range, price, armor, payload, pilot);
						break;
					default:
						System.out.println("Unknown classification: " + classification);
						break;
					}
					if (j != null) {
						jets.add(j);
					}
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}*/
