/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2.pkg3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andregoncalves
 */
public class Homework23 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
            
        
     try {    
         

  System.out.println("Please enter a number");
  
  BufferedReader myKb = new BufferedReader(new InputStreamReader(System.in));

  int num1 = Integer.parseInt(myKb.readLine());
  
      
  
if (num1 % 2 == 0){
    System.out.println("This is an Even number");
}

else {
    System.out.println("This is an Odd number");
}
     }
catch (Exception e){
        System.out.println("error");
        
    }
}