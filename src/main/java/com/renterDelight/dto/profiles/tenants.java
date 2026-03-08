package com.renterDelight.dto.profiles;

import lombok.Data;

@Data
public class tenants extends userProfile {
     private String nationality;
     private int age;
     private boolean immatriculated = false;
     private float[] rentRange;
}
