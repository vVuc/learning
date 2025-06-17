package com.menezes.learning.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sessions")
public class SessionEntity extends BaseEntity {

    @Column(name = "status")
    private String status;

    @OneToOne
    @JoinColumn(name = "agenda_id")
    private AgendaEntity agenda;

}
