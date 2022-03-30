package edu.sjsu.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFile {
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
