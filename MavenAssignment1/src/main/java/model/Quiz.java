
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fahad Zia
 */
public class Quiz implements java.io.Serializable { 
    private static final long serialVersionUID = 4950491128935286005L;
    public List <Question> questions;
    public String name;
    public int maxScore;
    
    public Quiz(String name, int max){
        this.name=name;
        maxScore=max;
        questions = new ArrayList();
    }
    
    public void addQuestion(Question a){ //adds question to Quiz
        questions.add(a);
    }
}
