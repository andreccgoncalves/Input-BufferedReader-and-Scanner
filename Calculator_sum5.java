/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_sum5;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class Calculator_sum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
      int num1, num2;
      
      
      Scanner myKb = new Scanner(System.in);
      
      try {
          
          System.out.println("Please enter a number");
          num1 = myKb.nextInt();
          
          System.out.println("Please enter another number");
          num2 = myKb.nextInt();
          
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
      
      } catch (Exception e) {
          
          System.out.println("That wasnt valid, please write a number");
    }
    
}
