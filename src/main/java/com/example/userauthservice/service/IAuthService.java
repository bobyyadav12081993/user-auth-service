package com.example.userauthservice.service;

import com.example.userauthservice.model.User;

public interface IAuthService {
    User signup(String email, String password);
    String login(String email, String password);
}
