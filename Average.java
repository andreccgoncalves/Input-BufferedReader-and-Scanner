/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
 String myFileName = "data.txt"; 
 
    int sum = 0;
    int count = 0;
    
 try {    
    
Scanner myFile = new Scanner(new FileReader(myFileName));
    

while (myFile.hasNext()) {
    
String input = myFile.nextLine();
System.out.println(input);

sum += Integer.parseInt(input);

count++;

}

     System.out.println("The average of the numbers in the file is: " + ((double) sum / count));

 }
 
 catch (Exception e) {
     System.out.println("Error to find the file");
 }
 }
 }
    
    

