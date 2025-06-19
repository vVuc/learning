package com.menezes.learning.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para sessão
 * 
 * Esta interface representa o repositório para sessão.
 * 
 */
public interface SessionRepository extends JpaRepository<SessionRepository, UUID> {

}
