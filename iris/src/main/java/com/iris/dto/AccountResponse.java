package com.iris.dto;

import lombok.Data;

@Data
public class AccountResponse {

    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
