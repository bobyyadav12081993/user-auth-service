package com.example.userauthservice.dto;

import com.example.userauthservice.model.Role;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private Long id;
    private String email;
    private Role role;
}
