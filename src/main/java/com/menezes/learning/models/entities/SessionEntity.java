package com.menezes.learning.models.entities;

import com.menezes.learning.models.enums.SessionStatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Entidade para sessão
 * 
 * Esta classe representa uma sessão de votação.
 * 
 */
@Entity
@Table(name = "SESSIONS")
public class SessionEntity extends BaseEntity {

    @Column(name = "Status")
    private SessionStatusEnum status;

    @OneToOne
    @JoinColumn(name = "Agenda_id")
    private AgendaEntity agenda;

}
