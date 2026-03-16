package com.renterDelight.controller;

import com.renterDelight.dao.LandlordRepository;
import com.renterDelight.dao.TenantRepository;
import com.renterDelight.dto.profiles.Landlord;
import com.renterDelight.dto.profiles.Tenants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/renterDelight")
public class RenterDelightController {

    @Autowired
    public final TenantRepository tenantRepository;
    @Autowired
    public final LandlordRepository landlordRepository;

    public RenterDelightController(TenantRepository tenantRepository, LandlordRepository landlordRepository) {
        this.tenantRepository = tenantRepository;
        this.landlordRepository = landlordRepository;
    }

    @GetMapping("tenantProfile/{id}")
    public Tenants getUserProfile(@PathVariable String id) {
        return tenantRepository.findById(id).orElse(null);
    }

    @PostMapping("tenantProfile/save")
    public void saveUserProfile(@RequestBody Tenants tenant) {
        tenantRepository.save(tenant);
    }

    @PostMapping("tenantProfile/viewAll")
    public List<Tenants> viewAllUserProfiles() {
        return tenantRepository.findAll();
    }
    @PostMapping("tenantProfile/update/{id}")
    public Tenants updateUser(@PathVariable String id) {

        Tenants tenants = tenantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        tenants.setImmatriculated(true);

        return tenantRepository.save(tenants);
    }

    /*******************LANDLORD CONTROLLER*******************/

    @GetMapping("landlordProfile/{id}")
    public Landlord getLandlordProfile(@PathVariable String id) {
        return landlordRepository.findById(id).orElse(null);
    }

    @PostMapping("landlordProfile/save")
    public void saveLandlordProfile(@RequestBody Landlord landlord) {
        landlordRepository.save(landlord);
    }

    @PostMapping("landlordProfile/viewAll")
    public List<Landlord> viewAllLandlordProfiles() {
        return landlordRepository.findAll();
    }


}
