package com.renterDelight.dto.profiles;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tenants")
@DiscriminatorValue("TENANT")
public class Tenants extends userProfile {
     private String nationality;
     private int age;
     private boolean immatriculated = false;
//     @Column(name = "rent_range")
//     private String rentRange;
}
