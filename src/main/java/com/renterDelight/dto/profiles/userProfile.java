package com.renterDelight.dto.profiles;

import lombok.Data;

import java.util.UUID;

@Data
public class userProfile {
     private String id = UUID.randomUUID().toString();
     private String name;
     private String email;
     private String phoneNumber;
     private String profilePictureUrl;
     private String bio;


}
