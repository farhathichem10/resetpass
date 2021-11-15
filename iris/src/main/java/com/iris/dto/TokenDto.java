package com.iris.dto;

import lombok.Data;

@Data
public class TokenDto {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}