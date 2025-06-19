package com.menezes.learning.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para voto
 * 
 * Esta interface representa o repositório para voto.
 * 
 */
public interface VoteRepository extends JpaRepository<VoteRepository, UUID> {

}
