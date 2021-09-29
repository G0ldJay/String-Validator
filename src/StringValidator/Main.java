/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringValidator;

import java.util.Scanner;
/**
 *
 * @author Jason
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringValidator sv = new StringValidator();
        //String text = "One lazy dog is too few, 13 is too many.";
        String text;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput Sentence (Type \"esc\" to exit:");
        
        text = sc.nextLine();
        
        if(!text.equals("esc")){
            do{
                sv.SetText(text);
            
                System.out.println("\nInput: " + text);
                System.out.println("Valid Sentence: " + sv.ValidateText());
                
                if(!sv.ValidateText()){
                    System.out.println(sv.GetFeedback());
                }
                
                System.out.println("\nInput Sentence (Type \"esc\" to exit:");
                text = sc.nextLine();
            }while(!text.equals("esc")); 
        }
    } 
}
