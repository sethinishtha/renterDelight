package com.renterDelight.dto.profiles;

import lombok.Data;

@Data
public class landlord extends userProfile{
    private boolean verified;
    private String companyName;
    private String companyAddress;

}
