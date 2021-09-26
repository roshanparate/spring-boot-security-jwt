package com.waytoimprove.vo;

import java.io.Serializable;

public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 6930647922959416711L;

    private String username;
    private String password;

    //default constructor need for JSON Parsing
    public JwtRequest() {
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
}
