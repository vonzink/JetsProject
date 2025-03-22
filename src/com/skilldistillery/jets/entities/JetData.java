package com.skilldistillery.jets.entities;

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

			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				String classification = fields[0];
				String jetName = fields[1];
				String model = fields[2];
				double speed = Double.parseDouble(fields[3]);
				int range = Integer.parseInt(fields[4]);
				long price = Long.parseLong(fields[5]);
				int capacity = Integer.parseInt(fields[6]);
				long payload = Long.parseLong(fields[7]);

				Jet j = null;

				switch (classification) {
				case "Bomber":
					j = new Bomber(jetName, model, speed, range, price, capacity, payload);
					break;
				case "CargoPlane":
					j = new CargoPlane(jetName, model, speed, range, price, capacity, payload);
					break;
				case "CommercialJet":
					j = new CommercialJet(jetName, model, speed, range, price, capacity, payload);
					break;
				case "Drone":
					j = new Drone(jetName, model, speed, range, price, capacity, payload);
					break;
				case "FighterJet":
					j = new FighterJet(jetName, model, speed, range, price, capacity, payload);
					break;
				case "Interceptor":
					j = new Interceptor(jetName, model, speed, range, price, capacity, payload);
					break;
				case "PrivateJet":
					j = new PrivateJet(jetName, model, speed, range, price, capacity, payload);
					break;
				case "ReconJet":
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
		return jets;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
