package com.careerhub.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.careerhub.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}