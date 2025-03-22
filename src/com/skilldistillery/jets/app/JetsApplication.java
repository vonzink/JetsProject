package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.Jet;
import java.util.List;


public class JetsApplication {

	private AirField airField;

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.start();
	}

	public void start() {
		airField = new AirField();
		List<Jet> jets = airField.printJets(airField.getFileName());

		for (Jet j : jets) {
			System.out.println(j);
		}

	}
}







// Create an AirField using the jets list
// airField = new AirField(jets);
// Start our menu loop

//no jets collection in app class. 
//only an Air Filed

//app.startMenu() {

/// TODO Create an AirFiled
/// Do wile loop
/// print menu
/// get user choice
/// switch on user
/// call an airField method
///
///
///

//sc.close();
