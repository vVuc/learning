package com.menezes.learning.models.entities;

import com.menezes.learning.models.enums.VoteTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entidade para voto
 * 
 * Esta classe representa um voto.
 * 
 */
@Entity
@Table(name = "VOTES")
public class VoteEntity extends BaseEntity {

    @Column(name = "Approval")
    private VoteTypeEnum approval;

    @ManyToOne
    @JoinColumn(name = "Session_id")
    private SessionEntity session;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private UserEntity user;

}