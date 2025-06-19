package com.menezes.learning.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Entidade para pauta
 * 
 * Esta classe representa uma pauta.
 * 
 */
@Entity
@Table(name = "AGENDAS")
public class AgendaEntity extends BaseEntity {

    @Column(name = "Description", length = 100)
    private String description;

    @Column(name = "Title", length = 50)
    private String title;

    @OneToMany
    @JoinColumn(name = "user_id")
    private String createdBy;

    @OneToOne(mappedBy = "agenda")
    private SessionEntity sessions;
}
