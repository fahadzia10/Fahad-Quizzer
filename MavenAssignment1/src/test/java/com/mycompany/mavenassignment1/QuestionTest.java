/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenassignment1;
import junit.framework.*;
import model.Question;

/**
 *
 * @author Fahad Zia
 */
public class QuestionTest extends TestCase {
    
    /**
     *
     */
    public void testCheckAnswer(){
    Question a=new Question("The formula for table salt is NaCl", "True", "tf"); //Prompt, CorrectAns, Type
    Question b=new Question("The formula for Bromine is Br3", "False", "tf"); 
    Question c=new Question("9 + 9 = ?", "18", "num");
    assertTrue(a.checkAns("True"));
    assertFalse(b.checkAns("True"));
    assertTrue(c.checkAns("18"));
    assertFalse(c.checkAns("0"));
    assertFalse(c.checkAns("10"));
    }
     
}
