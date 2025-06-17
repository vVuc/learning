package com.menezes.learning.models.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// TODO: Add a unique constraint to the email column
@Entity
@Table(name = "USERS")
public class UserEntity extends BaseEntity {

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "USERS", fetch = FetchType.LAZY)
    private List<VoteEntity> votes;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<SessionEntity> sessions;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<AgendaEntity> agendas;
}
