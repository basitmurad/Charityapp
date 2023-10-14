package com.basit.charityapp.model;

public class UserDetail {
    private String usernName , userNumber, userEmail, userPassword;

    public UserDetail(String usernName, String userNumber, String userEmail, String userPassword) {
        this.usernName = usernName;
        this.userNumber = userNumber;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public UserDetail() {
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
