/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whoareyou.scanner;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class WhoAreyouScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner myKb = new Scanner(System.in);
    
    
    String input;
    
        System.out.println("What is your name?");
        
        input = myKb.nextLine();
        
        System.out.println("Oh, that is a very nice name " +input + "!!!");
    }
    
}
