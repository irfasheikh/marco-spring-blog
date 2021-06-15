package com.codeup.springblog;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false , length = 100)
    private String email;

    @Column(nullable = false , length = 50)
    private String username;

    @Column(nullable = false , length = 50)
    private String password;

    public User() { }


    //insert constructor

    public User(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    //update constructor

    public User(long id, String email, String username, String password){
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public long getId(){
        return id;
    }

    public void setID(){
        this.id = id;
    }

    public String getEmail(){
        return email;
    }


