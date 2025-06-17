package com.menezes.learning.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "agendas")
public class AgendaEntity extends BaseEntity {

    @Column
    private String description;

    @Column
    private String title;

    @Column
    private String status;

    @OneToMany
    @JoinColumn(name = "user_id")
    private String createdBy;
}
