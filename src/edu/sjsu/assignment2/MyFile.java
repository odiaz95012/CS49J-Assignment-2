package edu.sjsu.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This class has the ability to read a file and write the prime numbers from the inputted file to another file.
 */
public class MyFile {
    /**
     * This function reads an inputted file and writes the prime numbers from the inputted file onto another file.
     * @param file1 - the inputted file with data in it
     * @param file2 - the file which we are writting the prime numbers onto.
     */
    public static void writePrimes(String file1, String file2){
        File inputFile = new File(file1);
        try(Scanner reader = new Scanner(inputFile); PrintWriter writer = new PrintWriter(file2)) {

            while(reader.hasNext()){
                String current = reader.nextLine();
                Scanner lineReader = new Scanner(current);
                lineReader.useDelimiter(",");
                while (lineReader.hasNext()){
                    String token = lineReader.next();
                    if(isPrime(token)){
                        writer.println(token);
                    }
                }
                
            }

        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    /**
     * This function is a helper function to check if the current number is a prime number.
     * @param text - the current value we've read from the file
     * @return true/false - depending if the input is a prime number or not.
     */
    private static boolean isPrime(String text){
        try {
            int n = Integer.parseInt(text);
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
