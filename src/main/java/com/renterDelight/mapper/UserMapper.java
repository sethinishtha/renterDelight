package com.renterDelight.mapper;

import com.renterDelight.dto.profiles.Landlord;
import com.renterDelight.dto.profiles.Tenants;
import com.renterDelight.dto.profiles.userProfile;
import com.renterDelight.dto.requests.RegistrationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "bio", ignore = true)
    @Mapping(target = "profilePictureUrl", ignore = true)
    @Mapping(target = "role", ignore = true)
    userProfile toUserProfile(RegistrationRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "bio", ignore = true)
    @Mapping(target = "profilePictureUrl", ignore = true)
    @Mapping(target = "nationality", ignore = true)
    @Mapping(target = "age", ignore = true)
    @Mapping(target = "immatriculated", ignore = true)
//    @Mapping(target = "rentRange", ignore = true)
    @Mapping(target = "role", ignore = true)
    Tenants toTenant(RegistrationRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    @Mapping(target = "userName", ignore = true)
    @Mapping(target = "bio", ignore = true)
    @Mapping(target = "profilePictureUrl", ignore = true)
    @Mapping(target = "verified", ignore = true)
    @Mapping(target = "companyName", ignore = true)
    @Mapping(target = "companyAddress", ignore = true)
    @Mapping(target = "role", ignore = true)
    Landlord toLandlord(RegistrationRequest request);
}
