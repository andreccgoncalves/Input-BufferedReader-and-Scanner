/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andregoncalves
 */
public class IntegerReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

     String fileName = "numbers.txt";   
     
     try {
     
     BufferedReader myFile = new BufferedReader(new FileReader(fileName));
     String input = myFile.readLine();
     
    int num1 = Integer.parseInt(input);
     
    if(input == null) {
        System.out.println("Empty file or the content is not an Integer.");
    }
    
    while(input.matches("[0-9]+")) {
    
        if(num1 > 100) {
            System.out.println("Too big");
        }
        else {
            System.out.println("Accepted");
        }
        break;
    }
       
    }
    catch (Exception e) {
        System.out.println("Empty file or the content is not an Integer");
    }
    }
    }