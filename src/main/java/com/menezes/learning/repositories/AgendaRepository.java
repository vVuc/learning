package com.menezes.learning.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para agenda
 * 
 * Esta interface representa o repositório para agenda.
 * 
 */
public interface AgendaRepository extends JpaRepository<AgendaRepository, UUID> {

}