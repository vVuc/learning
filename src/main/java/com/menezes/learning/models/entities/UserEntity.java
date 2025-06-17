package com.menezes.learning.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

// TODO: Add a unique constraint to the email column
@Entity
@Table(name = "Users", uniqueConstraints = @UniqueConstraint(columnNames = { "email" }))
public class UserEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
