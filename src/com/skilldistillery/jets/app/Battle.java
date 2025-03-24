package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.jets.entities.CombatReady;
import com.skilldistillery.jets.entities.Jet;

public class Battle {
    AirField airField = new AirField();
    List<Jet> jets = airField.printJets(airField.getFileName());

    public void startBattle(Jet chosen) {
        List<Jet> enemyPlanes = new ArrayList<>();
        for (Jet i : jets) {
            if (i instanceof CombatReady) {
                enemyPlanes.add(i);
            }
        }
        
        int randomNum = (int)(Math.random() * enemyPlanes.size());
        Jet enemy = enemyPlanes.get(randomNum);
        
        System.out.println("Your plane: " + chosen);
        System.out.println("Enemy plane: " + enemy);
        System.out.println();
        System.out.println();
        System.out.println();
       
        while (chosen.getArmor() > 0 && enemy.getArmor() > 0) {
            int damageByChosen = (int)(Math.random() * 1000) + 1;
            int damageByEnemy = (int)(Math.random() * 1000) + 1;
          
            System.out.println("Your plane deals " + damageByChosen + " damage to enemy plane.");
            enemy.setArmor(enemy.getArmor() - damageByChosen);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            
            System.out.println("Enemy plane deals " + damageByEnemy + " damage to your plane.");
            chosen.setArmor(chosen.getArmor() - damageByEnemy);
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println("Your plane capacity: " + chosen.getArmor());
            System.out.println("Enemy plane capacity: " + enemy.getArmor());
            System.out.println("----------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            
        }
        
        if (chosen.getArmor() <= 0 && enemy.getArmor() <= 0) {
            System.out.println("It's a tie!");
        } else if (chosen.getArmor() <= 0) {
            System.out.println("Your plane is down! Enemy wins!");
        } else {
            System.out.println("Enemy plane is down! You win!");
        }
    }
}