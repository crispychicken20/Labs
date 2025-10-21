package PokemonCodex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MyApp {
    private static final ArrayList<String> dataContain = new ArrayList<>(); 
    private static int countRead = 1;
    public  static int showMenu() {
        Scanner scnr = new Scanner(System.in);


        System.out.println("--- Menu Options ---");
        System.out.println("1. to Exit");
        System.out.println("2. to open data file");
        System.out.print("Enter an option 1 or 2: ");

        int userInput = scnr.nextInt();


        return userInput;
    }

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
                            
                } catch (Exception e) {
                    System.out.println("File was not read.." + e.getMessage());
                        return;
                    }

            }

                
        }

    }
        
    public static void test() {

        System.out.println("\n ---- first 7 lines ---");
        for(int i = 0; i < 7; i++) {
            System.out.printf("%4d: %s%n", i + 1, dataContain.get(i));

        }

        
        System.out.println("\n ---- last 7 lines ---");
        int lastSev = Math.max(1 - 1, countRead - 8);
        for(int i = lastSev; i < dataContain.size(); i++) {
            System.out.printf("%4d: %s%n", i + 1, dataContain.get(i));
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int menuOptions = showMenu();

        boolean correct = false;

        if(menuOptions == 1) {
            System.out.println("Exiting... Thanks for using this application");
        }
        else if(menuOptions == 2) {
            Scanner scnr = new Scanner(System.in);
            openDataFile();
            test();
            
        }
        else {
            System.out.println("Error: must enter a number of either 1 or 2");
        }
    }
}
