package com.example.springsecuritypractice.repository;

import com.example.springsecuritypractice.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
