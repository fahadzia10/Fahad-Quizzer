
package model;

import java.io.Serializable;

/**
 *
 * @author Fahad Zia
 */
public class Question implements Serializable {
    private static final long serialVersionUID = 4950491128935286005L; //Solves an error with saving files in different test runs

    public String prompt; 
    public String options[];
    public String type;
    public String correctAns;
    
    public Question(String a, String b[], String d){ //constructor for mcqs
        prompt=a;
        options=b;
        type="mcq";
        correctAns=d;
    }
    
    public Question(String a, String b, String c){ //contstructor for True False and Numericals
        prompt=a;
        correctAns=b;
        type="c";
    }
    
    public  boolean checkAns(String a){ //Checks for the correct answer 
        if(a.equals(correctAns))
            return true;
        else
            return false;
    }
}
