# JetsProject


## Description


Create a JetsApplication with a main method to launch your program.

Jets are found at an AirField. Create the AirField class, which has an empty List of Jets.


On program startup, populate the AirField with a total of 5 Jet instances representing each of your 3 defined Jet types. For example: 2 Cargo, 2 Fighter, and 1 Passenger kinds of Jets, where each instance has unique model, speed, range, and price.

These jets must be read from a text file, where each line in the file contains data for a single Jet object.

This file exists at the root of your Eclipse project. It can be comma- or tab-separated; either implementation is acceptable.
The method to parse a file into Jet objects should return a List<Jet> (ie: the AirField's fleet). Its parameter can be a String file name.

There is a menu 

List fleet prints out the model, speed (in MPH), range, and price of each jet. (There must be 5 jets stored in the AirField when the program starts).

Fly all Jets calls the fly() method on the entire fleet of jets. 

The view fastest jet and longest range options both display the jet's model, speed (in MPH), range, and price.


A user can add a Jet to the fleet.

This can be a PassengerJet(or 1 of your choosing).
Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
Users are prompted to enter the Jet's model, speed (in MPH), range, and price, and it is added to the AirField.

A user can remove a jet from the fleet.

The user is presented with a sub-menu allowing them to select which jet in the fleet to delete by its number.
User Story #11
The program continues until the user selects the option number to Quit, which exits the program.

## technologies used
 - Java
 - Eclipse
 - Git/GitHub
 - Sublime Text Editor
 - zsh
 - Slack lessons

 ## Concepts Applied

    - Conditional Statements
    - Mod
    - Interface / Abstract
    - buffer reader / writer
    - getters / setters
    - constructors
    - CSV .txt
    - exception handling useing try/catch block
    - Array lists
    - UML
    - do, while, and if statements
    - concatination and format strings
    - toString
    - try / catch
    - Abstraction, encapsulation, polymorphism, and inheritance

 ## Lessons Learned

 - make sure the text and parameter order matches up perfectly. 
 - add the Abstract method to the interface right away so Eclise will create the    Override Method. 
 - use bufIn.readLine() to skip the header in the datat if there is one
 - check or redo the constructor when changing datatypes
 - .trim() dosnt always work to eliminate whitespace on both sides of a split character. 
 - when to declare instances in the class vs the method 
 - its less confussing to make classes for each major item of the menu. 
 - I can read and write evertyhing as strings with the PrintWriter. 
 - its sometimes easier to just put the logic in the getters and setter methods
 - be really careful with the order in which the attributes match with the parameters. 
 - I only needed the toString in the abstract method



 ## Notes
 seperating menu from main to keep it cleaner added some additional data. 
 setup some Overloaded methods for additional lines of information in my edited text file. edited the Jet toString for better formatting. 
 added the flighttime equation to the getter in Jet class. 
 The writer is a bit tricky, forgeting the true in the writer will distroy the data. 
 Try catch block as useful but needs to be placed correctly. 
 Still havings issues with null values. 
 
 The cursor most be perfectly placed in the .txt files.. additionally you need to exit and restart the program to see the added or deleted data. 

.trim to remove the whitespace was buggy, better to format the .txt without.
sc.close neeeds to be left open when collecting input in multiple methods
its easier to use i in the for.each loops so i remember what variable is the index. 
lots of issues with brackets and keeping items in scope. 




