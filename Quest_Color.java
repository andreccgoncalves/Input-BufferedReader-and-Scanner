/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest_color;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andregoncalves
 */
public class Quest_Color {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
      
      String input1;
      
      try {
      
          System.out.println("What is your quest? ");
          input1 = myKB.readLine();
      
          
          String input2;
          System.out.println("What is your favourite colour?");
          input2 = myKB.readLine();
          
          System.out.println("Ah, I see your quest is to " + input1 + ", and your favourite colour is " + (input2));
          
    }
    catch (Exception e){
}
    
}
