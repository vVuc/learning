package com.menezes.learning.models.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Entidade para usuário
 * 
 * Esta classe representa um usuário.
 * 
 */
@Entity
@Table(name = "USERS")
public class UserEntity extends BaseEntity {

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Email", unique = true, length = 100)
    private String email;

    @Column(name = "Password")
    private String password;

    @OneToMany(mappedBy = "USERS", fetch = FetchType.LAZY)
    private List<VoteEntity> votes;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<SessionEntity> sessions;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<AgendaEntity> agendas;
}
