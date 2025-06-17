package com.menezes.learning.models.entities;

import com.menezes.learning.models.enums.VoteTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "VOTES")
public class VoteEntity extends BaseEntity {

    @Column(name = "approval")
    private VoteTypeEnum approval;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private SessionEntity session;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}