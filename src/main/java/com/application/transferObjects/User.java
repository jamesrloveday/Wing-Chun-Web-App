package com.application.transferObjects;

import org.springframework.data.annotation.Id;

/**
 * Created by james on 02/06/2016.
 */
public class User {

    @Id
    public String id;
    public String firstName;
    public String lastName;
    public String clubLocation;
    public String instructorName;
    public String username;
    public String password;
    public String email;

    public User(){}

    public User(String id) {
        this.id = id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String firstName,
                String lastName,
                String clubLocation,
                String instructorName,
                String username,
                String password,
                String email) {
        this(username, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.clubLocation = clubLocation;
        this.instructorName = instructorName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
