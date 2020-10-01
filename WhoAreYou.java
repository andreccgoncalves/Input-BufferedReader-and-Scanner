/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whoareyou;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author andregoncalves
 */
public class WhoAreYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BufferedReader myKB= new BufferedReader(new InputStreamReader(System.in));
      
      String input;
        System.out.println("What is your name? ");
      try {
      input = myKB.readLine();
          System.out.println("Oh, that is a very nice name, " + input + "!!!!");
    }
    catch (Exception e){
}
