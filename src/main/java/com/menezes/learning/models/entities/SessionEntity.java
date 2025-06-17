package com.menezes.learning.models.entities;

import com.menezes.learning.models.enums.SessionStatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SESSIONS")
public class SessionEntity extends BaseEntity {

    @Column(name = "status")
    private SessionStatusEnum status;

    @OneToOne
    @JoinColumn(name = "agenda_id")
    private AgendaEntity agenda;

}
