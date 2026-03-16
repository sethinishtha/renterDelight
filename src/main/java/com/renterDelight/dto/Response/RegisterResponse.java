package com.renterDelight.dto.Response;

import lombok.Data;

@Data
public class RegisterResponse {
    private String id;
    private String email;


    public RegisterResponse(String id, String email) {
        this.id = id;
        this.email = email;
    }
}
