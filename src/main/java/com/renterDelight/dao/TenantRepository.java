package com.renterDelight.dao;

import com.renterDelight.dto.profiles.Tenants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenants, String> {


}
