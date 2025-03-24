package com.skilldistillery.jets.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.skilldistillery.jets.entities.Jet;
import java.util.Scanner;

public class DeleteFromAirField {

	AirField airField = new AirField();
	List<Jet> jets = airField.printJets(airField.getFileName());

	public void deleteFromAirField() {
		Scanner sc = new Scanner(System.in);

		int index = 1;
		for (Jet i : jets) {
			System.out.print(index + ": ");
			i.fly();
			index++;
		}
		int answer = 0;
		System.out.println("Enter the number of the plane you would like to remove");
		try {
			answer = sc.nextInt();
		} catch (Exception e) {
			System.err.println("Choose a number");
			
		}
			jets.remove(answer - 1);
			System.out.println("Jet removed successfully!");

			try (PrintWriter pw = new PrintWriter(new FileWriter("jetData.txt", false))) {
				for (Jet j : jets) {
					String line = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", j.getClassification(), j.getJetName(),
							j.getModel(), j.getSpeed(), j.getRange(), j.getPrice(), j.getArmor(), j.getPayload(),
							j.getPilot());
					pw.println(line);
				}

				System.out.println("File updated successfully!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
