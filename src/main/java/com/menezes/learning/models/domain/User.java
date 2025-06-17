package com.menezes.learning.models.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * User class
 * 
 * This class represents a user of the system.
 * 
 */
@Setter
@Getter
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String password;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
