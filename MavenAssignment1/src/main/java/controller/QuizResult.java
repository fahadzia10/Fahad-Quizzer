
package controller;

import model.Quiz;

/**
 *
 * @author Fahad Zia
 */
public class QuizResult {
    int perQuestion;
    int scored;
    int correct;
    int total;
    int percentage;
    
    public QuizResult(Quiz e){
        total=e.maxScore;
        perQuestion=total/5;
    }
    
    public float getScore(int correct){
        scored=correct*perQuestion;
        return scored;
    }
    
    public float getPercentage(int scored){
        percentage=100*scored/total;
        return percentage;
    }
}
