/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderscanner;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class FileReaderScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String myFileName = "/Users/andregoncalves/Desktop/Computing and IT/1 semester/Programming - Object Oriented Approach/Week 4/SimpleFileReadBufferedReader/testfile.txt";
       
        try {
        Scanner myFile = new Scanner(new FileReader(myFileName));
        
        if (myFile.hasNext()) {
            String input = myFile.nextLine();
            System.out.println("The text in the File " + myFileName + " is " + input);
        }
    
        else {
            System.out.println("The text in the file " + myFileName + "is empty!");
        }
        }
        catch (Exception e){
            System.out.println("Error - unable to find file " + myFileName);
}
    }
}

