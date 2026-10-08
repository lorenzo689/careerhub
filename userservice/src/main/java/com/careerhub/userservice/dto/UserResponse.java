package com.careerhub.userservice.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.careerhub.userservice.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String headline;
    private String about;
    private String location;
    private String profilePhotoUrl;
    private String coverPhotoUrl;
    private UserRole role;
    private List<String> skills = new ArrayList<>();
    private LocalDateTime createdAt;

}