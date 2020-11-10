/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader_bufferedreader_loop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andregoncalves
 */
public class FileReader_BufferedReader_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
        
        String myFileName = "myFriends.txt";
    

    
BufferedReader myFile = new BufferedReader(new FileReader(myFileName));
        
   
        
String input; 

  while ((input = myFile.readLine()) != null) {
    System.out.println("The text in the file is : " + input); 

  }
  }
  } 
  
  






    
    

