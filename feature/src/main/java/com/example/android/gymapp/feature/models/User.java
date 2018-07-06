package com.example.android.gymapp.feature.models;

/**
 * Created by Adrian on 05/07/2018.
 */

public class User {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String password;


    public User(String fname, String lname, String email, String password ) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;

    }

    public User(int id, String fname, String lname, String email ){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;

    }

    public User(int id, String fname, String lname, String email, String password ) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return fname;
    }
    public String getLastName() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }

}
