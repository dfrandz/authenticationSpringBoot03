package com.frandz.security.service;

import com.frandz.security.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceImpl {
    List<User> getAllUser();
    Optional<User> getByEmail(String email);
}
