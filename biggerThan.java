/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2.pkg1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andregoncalves
 */
public class Homework21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
              try {  
        
              
                  
        BufferedReader myKb = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter a number");
        int num1 = Integer.parseInt(myKb.readLine());
        

            
        System.out.println("Please enter another number");  
        int num2 = Integer.parseInt(myKb.readLine());
            
        
        
            if ( num1 > num2 ) {
                System.out.println(num1 + " is bigger than " + num2);
            }  
                
            else if (num2 > num1 ) {
            System.out.println(num2 + " is bigger than " + num1);
            }
            
            else if (num1 == num2){ 
            System.out.println(num1 + " is equal to " +num2);
            }
              }
    
             catch (Exception e) {
                 System.out.println("error");
             
        }
    }
    

