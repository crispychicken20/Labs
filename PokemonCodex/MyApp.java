package PokemonCodex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * class meant to read input for reading a file
 * menu options fo user to open a file or exit
 * print first and last of a file
 * @author Christopher Perez
 * @version 1.0
 */
public class MyApp {
    /**
     * Contain data within a arraylist that will be used
     * to hold elements within a file
     */
    private static final ArrayList<String> dataContain = new ArrayList<>(); 

    /**
     * Will be used to keep track of number of lines being
     * read within a file
     */
    private static int countRead = 1;


    /**
     * 
     * Displayes menu to the user and returns input from user
     * 
     * @return userInput
     */
    public  static int showMenu() {
        Scanner scnr = new Scanner(System.in);


        System.out.println("--- Menu Options ---");
        System.out.println("1. to Exit");
        System.out.println("2. to open data file");
        System.out.print("Enter an option 1 or 2: ");

        int userInput = scnr.nextInt();


        return userInput;
    }

    /**
     * 
     * Reads in file from pokemon.csv
     * adds data into arrayList of type string
     * tracks number of lines that were read in the file
     * @see pokemon.csv
     */
    public static void openDataFile() {
        

        dataContain.clear();
        Scanner scnr = new Scanner(System.in);
        boolean success = false;
        File file = null;
        while(!success) {
            System.out.print("Enter file name: ");
            String fileName = scnr.nextLine();
            file = new File(fileName);
            if(!file.exists()) {
                System.out.println("File not found. Please try again.");
                continue;
            }
            else {
                try {
                    try(FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
                        String line;
                        boolean done = false;
                        while(!done) {
                            line = br.readLine();
                            if(line == null) {
                                done = true;
                            }
                            else {
                                dataContain.add(line);
                                countRead++;
                            }
                        }
                        success = true;
    
                    }   
                            
                } catch (IOException e) {
                    System.out.println("File was not read.." + e.getMessage());
                        return;
                    }

            }

                
        }

    }
    
    /**
     * Gathers first 7 lines of pokemon file
     * 
     * Gathers last 7 lines of pokemon file
     */
    public static void test() {

        System.out.println("\n ---- first 7 lines ---");
        for(int i = 0; i < 7; i++) {
            System.out.printf("%4d: %s%n", i + 1, dataContain.get(i));
            System.out.print(" ");

        }

        
        System.out.println("\n ---- last 7 lines ---");
        int lastSev = Math.max(1 - 1, countRead - 8);
        for(int i = lastSev; i < dataContain.size(); i++) {
            System.out.printf("%4d: %s%n", i + 1, dataContain.get(i));
            System.out.print(" ");
        }
        System.out.println();

    }

    /**
     * methods called within main 
     * menuOptions variable created for to gather user input from 
     * opendatafile method
     * @param args
     */
    public static void main(String[] args) {
        int menuOptions = showMenu();
        final int EXIT_PROGRAM = 1;
        final int OPEN_FILE = 2;


        switch (menuOptions) {
            case EXIT_PROGRAM:
                System.out.println("Exiting... Thanks for using this application");
                break;
            case OPEN_FILE:
                Scanner scnr = new Scanner(System.in);
                openDataFile();
                test();
                break;
            default:
                System.out.println("Error: must enter a number of either 1 or 2");
                break;
        }
    }
}
