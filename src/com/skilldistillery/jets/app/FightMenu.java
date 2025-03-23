package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.Jet;

public class FightMenu {
     AirField airField = new AirField();
     Scanner sc = new Scanner(System.in);
     List<Jet> jets = airField.printJets(airField.getFileName());
     int answer = 0;
    
     public void fightMenu() {
        System.out.println("Welcome to Combat, please choose your plane");
    
        
        do {
            System.out.println("------------------------------------");
            System.out.println("          Choose Your Plane         ");
            System.out.println("------------------------------------");
            System.out.println("1. List Combat Ready Planes avaiable");
            System.out.println("2. Add a combate plane");
            System.out.println("3.choose your plane");
            System.out.println("4. Return to main menu");
            System.out.println("9. Quit");
            System.out.println("------------------------------------");

            try {
                answer = sc.nextInt();
            } catch (Exception e) {
                System.err.println("Invalid number, please enter a number");
                sc.nextLine(); // clear the buffer
                continue;
            }
            
            switch (answer) {
                case 1:
                    System.out.println("           LIST COMBAT PLANES       ");
                    System.out.println("------------------------------------");
                    for (Jet jet : jets) {
                        if (jet instanceof CombatReady) {
                            System.out.println(jet);
                        }
                    }
                    break;
                case 2:
                    System.out.println("           LIST COMBAT PLANES       ");
                    System.out.println("------------------------------------");
                    for (Jet jet : jets) {
                        if (jet instanceof CombatReady) {
                            System.out.println(jet);
                        }
                    }
                    break;
                case 3:
                    System.out.println("           LIST COMBAT PLANES       ");
                    System.out.println("------------------------------------");
                    for (Jet jet : jets) {
                        if (jet instanceof CombatReady) {
                            System.out.println(jet);
                        }
                    }
                    break;
                case 4:
                    System.out.println("       RETURN TO MAIN MENU          ");
                    System.out.println("------------------------------------");
                   
                   Menu menu = new Menu(); 
                   menu.displayMenu(); 

                    break;
                case 9:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
            
        } while (answer != 9);
        sc.close();
    }
    
    // Additional methods can use airField, jets, sc, and answer here
}