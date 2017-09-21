package model;

public class User implements java.io.Serializable {
    public String username;
    String password;
    public String role;
    int score;
    
    public User(String a, String b, String c, int d){
        username=a; password=b; role=c; score=d;
    }

}
