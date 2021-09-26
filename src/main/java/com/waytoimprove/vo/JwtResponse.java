package com.waytoimprove.vo;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -4657290671538224234L;

    private final String jwtToken;

    public JwtResponse(String token) {
        this.jwtToken = token;
    }

    public String getJwtToken() {
        return this.jwtToken;
    }
}
