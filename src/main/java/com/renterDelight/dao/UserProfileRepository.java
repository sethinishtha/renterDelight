package com.renterDelight.dao;

import com.renterDelight.dto.profiles.userProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<userProfile, String> {

    Optional<userProfile> findByEmail(String email);
    boolean existsByEmail(String email);
}
