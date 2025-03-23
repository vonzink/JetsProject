package com.skilldistillery.jets.app;


public class JetsApplication {

	private Menu menu; 

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.start();
	}

	public void start() {

		menu = new Menu(); 
		menu.displayMenu(); 
	}
}
