package task3;

/* Stylianos Gakis STGA0006 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Animal> animalsArrayList = new ArrayList<>();

    // Important: Someone here could also use two separate array lists, each containing the separate type of Animals.
    // However in this case we will use the array list above, to showcase the power of inheritance.
    //private ArrayList<Terrestrial> terrestrialsArrayList = new ArrayList<>();
    //private ArrayList<Aquatic> aquaticsArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Main myApp = new Main();
        myApp.runProgram();
    }

    private void runProgram() {
        boolean running = true;
        while (running) {
            int userMenuChoice = printMenu();
            switch (userMenuChoice) {
                case 1:
                    addTerrestrialAnimal();
                    break;
                case 2:
                    addAquaticAnimal();
                    break;
                case 3:
                    viewAllAnimals();
                    break;
                case 4:
                    running = false;
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Enter a proper value");
                    break;
            }
        }
    }

    private int printMenu() {
        // Here we are using the printMenu() method to also get user's input at the same time.
        System.out.println("1. Add a terrestrial animal");
        System.out.println("2. Add a aquatic animal");
        System.out.println("3. View all animals");
        System.out.println("4. Exit");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    private void addTerrestrialAnimal() {
        // Read all the required variables in order to construct a Terrestrial animal
        System.out.println("--- Terrestrial add ---");
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter number of legs");
        int numberOfLegs = input.nextInt();
        input.nextLine();

        // Construct the object using the variables we have read from the user
        Terrestrial animal = new Terrestrial(name, numberOfLegs);
        // Finally, add our new animal object into the array list.
        animalsArrayList.add(animal);
    }

    private void addAquaticAnimal() {
        // Read addTerrestrialAnimal() for explanation.
        System.out.println("--- Aquatic add ---");
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter number of fins");
        int numberOfFins = input.nextInt();
        input.nextLine();

        Aquatic animal = new Aquatic(name, numberOfFins);
        animalsArrayList.add(animal);
    }

    private void viewAllAnimals() {
        // Loop through our entire animal list.
        for (int i = 0; i < animalsArrayList.size(); i++) {
            // Get the object at the index that we are currently at, in the loop.
            Animal currentAnimal = animalsArrayList.get(i);
            // Print the index we are at before we do the check to see what type of animal it is.
            System.out.printf("[%d] = ", i);
            if (currentAnimal instanceof Terrestrial) {
                // Inside this if, we know it's a Terrestrial object, so we can safely cast it into one.
                Terrestrial terrestrialAnimal = (Terrestrial) currentAnimal;
                // Then we can use this new object to safely call Terrestrial-specific methods like getNumberOfLegs().
                System.out.printf("Terrestrial: {name = %s, number of legs = %d}%n",
                        terrestrialAnimal.getName(),
                        terrestrialAnimal.getNumberOfLegs()
                );
            } else if (currentAnimal instanceof Aquatic) {
                // Another way to do this, would be to simply print it, which will call the toString() method from
                // Aquatic. Refer to that method inside the Aquatic class for further explanation.
                System.out.println(currentAnimal);
            }
        }
    }
}
