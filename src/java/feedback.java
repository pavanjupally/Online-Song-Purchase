/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author S525796
 */
@Named(value = "feedback")
@RequestScoped
public class feedback {
String name;
String email;
String message;
String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Creates a new instance of feedback
     */
    public feedback() {
    }
    
    public void feed(){
    str="Thanks for submitting a support request! Please allow 24-48 hours to process your request.";
 
    }
}
