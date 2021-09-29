/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringValidator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Jason
 */
public class StringValidator {
    private String text;
    private String feedback;
    
    public StringValidator(String text){
        this.text = text;
        feedback = "";
    }
    
    public StringValidator(){
        text = "The quick brown fox said “hello Mr lazy dog”.";
        feedback = "";
    }
    
    public void SetText(String text){
        this.text = text;
    }
    
    public String GetFeedback(){
        return this.feedback;
    }
    
    //Returns true if string provided satisfies all rules.
    public boolean ValidateText(){
        if(!RuleOne(text)){
            feedback = "Sentence Invalid. Rule 1 broken: \"Sentence must start with a capital letter\".";
            return false;
        }
        
        if(!RuleTwo(text)){
            feedback = "Sentence Invalid. Rule 2 broken: \"Sentence must have even number of quotation marks\".";
            return false;
        }
        
        if(!RuleThree(text)){
            feedback = "Sentence Invalid. Rule 3 broken: \"Sentence must end with a period character\".";
            return false;
        }
        
        if(!RuleFour(text)){
            feedback = "Sentence Invalid. Rule 4 broken: \"Sentence must not have more than one period character\".";
            return false;
        }
        
        //Can just return the result of last rule as everything counts on it passing or not.
        if(!RuleFive(text)){
            feedback = "Sentence Invalid. Rule 5 broken: \"Numbers below 13 must be spelt (one, two, etc)\".";
            return false;
        }else{
            feedback = "";
            return true;
        }
    }
    
    //Checks that string provided starts with capital letter.
    private boolean RuleOne(String text){
        String regexRule = "^[A-Z].*$";//Regex to check for capital letter at start.
        
        return Validator(text, regexRule);
    }
    
    //Counts number of quotation marks found and makes sure they are even.
    private boolean RuleTwo(String text){
        String regexRule = "\"";
        
        int occur = CountOccurences(text, regexRule);
        
        return occur == 0 | occur % 2 == 0;
    }
    
    //Checks that there is a period at the end of the string.
    private boolean RuleThree(String text){
        String regexRule = "^.*\\.$";
        
        return Validator(text, regexRule);
    }
    
    //Checks period count doesn't go above 1 as rule above already checks period is in last place.
    private boolean RuleFour(String text){
        String regexRule = "\\.";
        
        int occur = CountOccurences(text, regexRule);
        
        return occur == 1;
    }
    
    //Don't really need to check if numbers are spelt or not. All we care about is if the lieral digits for 0-12 are there.
    private boolean RuleFive(String text){
        String regexRule = "(\\b[0-9]\\b)|(\\b1[0-2]\\b)"; //Regex for finding any digit from 0-12
        int occur = CountOccurences(text, regexRule);
        
        return occur == 0;
        
    }
    
    //Validates string provided follows regex provided.
    private boolean Validator(String text, String reg){
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        
        return m.matches();
    }   
    
    //Counts matches that it finds in string to regex provided.
    private int CountOccurences(String text, String reg){
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        
        int count = 0;
        
        while(m.find()){
            count++;
        }
        
        return count;
    }
}