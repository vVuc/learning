package com.menezes.learning.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AGENDAS")
public class AgendaEntity extends BaseEntity {

    @Column(length = 100)
    private String description;

    @Column(length = 50)
    private String title;

    @OneToMany
    @JoinColumn(name = "user_id")
    private String createdBy;

    @OneToOne(mappedBy = "agenda")
    private Sess sessions;
}
