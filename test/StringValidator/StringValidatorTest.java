/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringValidator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jason
 */
public class StringValidatorTest {
    
    public StringValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of SetText method, of class StringValidator.
     */
    @Test
    public void testSetText() {
        
    }

    /**
     * Test of ValidateText method, of class StringValidator.
     */
    @Test
    public void testValidateTextOne() {
        System.out.println("VaidateTextOne");
        
        boolean expectedResult = true;
        String text = "The quick brown fox said \"hello Mr lazy dog\".";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextTwo() {
        System.out.println("\nVaidateTextTwo");
        
        boolean expectedResult = false;
        String text = "The quick brown fox said \"hello Mr. lazy dog\".";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextThree() {
        System.out.println("\nVaidateTextThree");
        
        boolean expectedResult = true;
        String text = "The quick brown fox said hello Mr lazy dog.";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextFour() {
        System.out.println("\nVaidateTextFour");
        
        boolean expectedResult = false;
        String text = "the quick brown fox said \"hello Mr lazy dog\".";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextFive() {
        System.out.println("\nVaidateTextFive");
        
        boolean expectedResult = true;
        String text = "One lazy dog is too few, 13 is too many.";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextSix() {
        System.out.println("\nVaidateTextSix");
        
        boolean expectedResult = false;
        String text = "\"The quick brown fox said \"hello Mr lazy dog\".";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextSeven() {
        System.out.println("\nVaidateTextSeven");
        
        boolean expectedResult = true;
        String text = "One lazy dog is too few, thirteen is too many.";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testValidateTextEight() {
        System.out.println("\nVaidateTextEight");
        
        boolean expectedResult = false;
        String text = "One lazy dog is too few, 12 is too many.";
        StringValidator sv = new StringValidator();
        sv.SetText(text);
        
        boolean actualResult = sv.ValidateText();
        
        System.out.println("Input: " + text + "\nExpected Result: " + expectedResult + "\nActual Result: " + actualResult);
        
        assertEquals(expectedResult, actualResult);
    }
    
}
