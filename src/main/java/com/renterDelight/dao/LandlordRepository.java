package com.renterDelight.dao;

import com.renterDelight.dto.profiles.Landlord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandlordRepository extends JpaRepository<Landlord,String> {
}
