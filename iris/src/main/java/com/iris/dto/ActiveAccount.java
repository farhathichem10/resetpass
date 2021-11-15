package com.iris.dto;

import lombok.Data;

@Data
public class ActiveAccount {

    private String mail;
    private String code;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}