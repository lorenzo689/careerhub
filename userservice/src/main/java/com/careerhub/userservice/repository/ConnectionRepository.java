package com.careerhub.userservice.repository;

import java.sql.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionRepository extends JpaRepository<Connection, String> {
    
}