package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {


    @NotBlank(message = "Username cannot be blank")
    @Size(min = 5,max = 15)
    private String username;

    @Email
    private String email;

    @Size(min = 6)
    @NotBlank(message = "Password cannot be blank")
    private String password;


    @NotBlank(message = "Password verification field cannot be blank")
    @NotNull(message= "Passwords do not match")
    private String verify;

    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }


    private void checkPassword(){

            if (password != null && verify != null && !password.equals(verify)){
                verify = null;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify (String verifyPassword) {
        this.verify = verifyPassword;
        checkPassword();
    }


}

