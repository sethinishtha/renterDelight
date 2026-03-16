package com.renterDelight.controller;

import com.renterDelight.dao.UserProfileRepository;
import com.renterDelight.dto.Response.RegisterResponse;
import com.renterDelight.dto.profiles.userProfile;
import com.renterDelight.dto.requests.RegistrationRequest;
import com.renterDelight.user.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/auth")
public class LoginController {

    private final UserService userService;

    private final UserProfileRepository userProfileRepository;


    public LoginController(UserService userService, UserProfileRepository userProfileRepository) {
        this.userService = userService;
        this.userProfileRepository = userProfileRepository;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterResponse register(@Valid @RequestBody RegistrationRequest request) {
        userProfile user = userService.register(request);
        return new RegisterResponse(user.getId(), user.getEmail());
    }
    @GetMapping("/viewAll")
    public List<userProfile> viewAllUserProfiles() {
        return userProfileRepository.findAll();
    }

}
