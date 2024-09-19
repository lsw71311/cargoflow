package com.spring_cloud.eureka.client.auth.domain.repository;

import com.spring_cloud.eureka.client.auth.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}

