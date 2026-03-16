package com.renterDelight.dto.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, max = 72)
    private String password;

    @NotBlank
    private String name;

    @NotBlank
    private String role; // "LANDLORD" or "TENANT"

    @NotBlank
    private String phoneNumber;


}
