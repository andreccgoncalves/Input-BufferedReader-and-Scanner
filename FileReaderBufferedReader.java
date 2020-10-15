/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereaderbufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author andregoncalves
 */
public class FileReaderBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        String myFileName = "/Users/andregoncalves/Desktop/Computing and IT/1 semester/Programming - Object Oriented Approach/Week 4/SimpleFileReadBufferedReader/testfile.txt";
    
    try {
        
        BufferedReader myFile = new BufferedReader(new FileReader(myFileName));
        
        String input = myFile.readLine();
        
        if (input != null){
            System.out.println("The text in the file " + myFileName + " is " + input);           
        }
      
        else {
            System.out.println("The file " + myFileName + "is empty!");
        }
    }
        catch (Exception e) {
                System.out.println("Error - unable to find file " + myFileName);
                }   
    }
    }
    

