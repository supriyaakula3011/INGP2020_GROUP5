package com.visa.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.visa.app.model.User;
import com.visa.app.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
