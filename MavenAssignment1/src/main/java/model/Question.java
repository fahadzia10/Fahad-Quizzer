/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Fahad Zia
 */
public class Question implements Serializable {
    private static final long serialVersionUID = 4950491128935286005L;

    public String prompt;
    public String options[];
    public String type;
    public String correctAns;
    
    public Question(String a, String b[], String d){
        prompt=a;
        options=b;
        type="mcq";
        correctAns=d;
    }
    
    public Question(String a, String b, String c){
        prompt=a;
        correctAns=b;
        type="c";
    }
    
    public  boolean checkAns(String a){
        if(a.equals(correctAns))
            return true;
        else
            return false;
    }
}
