package com.menezes.learning.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menezes.learning.models.entities.UserEntity;

/**
 * Repositório para usuário
 * 
 * Esta interface representa o repositório para usuário.
 * 
 */
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByEmail(String Email);
}