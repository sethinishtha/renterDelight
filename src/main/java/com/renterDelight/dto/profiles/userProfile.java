package com.renterDelight.dto.profiles;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Table(name = "userprofile")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class userProfile {
     @Id
     @JdbcTypeCode(SqlTypes.VARCHAR)
     private String id = UUID.randomUUID().toString();
     private String name;
     private String email;
     @Column(name = "phone_number")
     private String phoneNumber;
     @Column(name = "profile_picture_url")
     private String profilePictureUrl;
     private String bio;
     @Column(name = "user_name")
     private String userName;
     @Column(name = "password_hash")
     private String passwordHash;
     private boolean enabled;

     @Column(name = "role", insertable = false, updatable = false)
     private String role;
}
