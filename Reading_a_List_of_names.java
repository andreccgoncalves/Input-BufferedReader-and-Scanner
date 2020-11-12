/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reading_a_list_of_names;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class Reading_a_List_of_names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
     
     try {   
        
        String myFileName = "myFriends.txt";
       
       Scanner myFile = new Scanner(new FileReader(myFileName));
      
   
while (myFile.hasNext()) {
    
String input = myFile.nextLine();
System.out.println(input);

    
    }

    
    System.out.println("End of the list");
    
    }
    
    
    
   catch (Exception e) {
       System.out.println("Error to find the file");
    }

    }
    }

    

