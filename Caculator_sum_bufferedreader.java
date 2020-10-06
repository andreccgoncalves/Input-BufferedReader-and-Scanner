/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caculator_sum_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andregoncalves
 */
public class Caculator_sum_bufferedreader {

    {
    public static void main(String[] args) throws Exception
            
        
        {       
  System.out.println("Please enter a number");
  
  BufferedReader myKb = new BufferedReader(new InputStreamReader(System.in));

  
     try {   
   
  int num1 = Integer.parseInt(myKb.readLine());
  
      
   
        System.out.println("Please enter another number");
        
         int num2 = Integer.parseInt(myKb.readLine());
  
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }
        }
catch (Excpetiion e) {
    
   
       }

        