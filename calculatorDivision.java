/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2.pkg2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andregoncalves
 */
public class Homework22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        try {
    
        BufferedReader myKb = new BufferedReader (new InputStreamReader(System.in));
       
        System.out.println("Please enter a number");
        int num1 = Integer.parseInt(myKb.readLine());
        
      
        
        
        System.out.println("Please enter another number");
        int num2 = Integer.parseInt(myKb.readLine());
        
        if (num2 == 0) {
            System.out.println("Error");
        }
        
        else {
        
        System.out.println("The first number divided by the second is " + (num1/num2));
        
    }
}

catch (Exception e){
    System.out.println("error");
}
    }