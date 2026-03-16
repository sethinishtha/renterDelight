package com.renterDelight.user;

import com.renterDelight.dao.UserProfileRepository;
import com.renterDelight.dto.profiles.userProfile;
import com.renterDelight.dto.requests.RegistrationRequest;
import com.renterDelight.mapper.UserMapper;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserProfileRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserService(UserProfileRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       UserMapper userMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    @Transactional
    public userProfile register(RegistrationRequest request) {
        String email = request.getEmail().trim().toLowerCase();

        if (userRepository.existsByEmail(email)) {
            throw new IllegalArgumentException("Email already in use");
        }

//        if (request.userName()==null){
//            request.setUserName(email);
//        }

//        if(userRepository.existsByUserName(request.getUserName())) {
//            throw new IllegalArgumentException("Username already in use");
//        }

        userProfile user = switch (request.getRole().toUpperCase()) {
            case "TENANT" -> userMapper.toTenant(request);
            case "LANDLORD" -> userMapper.toLandlord(request);
            default -> throw new IllegalArgumentException("Invalid role: " + request.getRole());
        };

        user.setEmail(email);
        user.setPasswordHash(passwordEncoder.encode(request.getPassword()));
        user.setEnabled(true);

        return userRepository.save(user);
    }
}
