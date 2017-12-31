
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
    assertTrue(a.checkAns("True")); //Pass if true is the correct answer
    assertFalse(b.checkAns("True")); //Pass if true is the wrong answer
    assertTrue(c.checkAns("18")); // Pass if 18 is the right answer
    assertFalse(c.checkAns("0")); //Pass if 0 and 10 are wrong answers
    assertFalse(c.checkAns("10"));
    }
     
}
