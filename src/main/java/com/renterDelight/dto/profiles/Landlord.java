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
@Table(name = "landlord")
@DiscriminatorValue("LANDLORD")
public class Landlord extends userProfile {
    private boolean verified;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_address")
    private String companyAddress;
}
