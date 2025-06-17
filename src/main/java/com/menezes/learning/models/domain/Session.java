package com.menezes.learning.models.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Session class
 * 
 * This class represents a session of a vote.
 * 
 */
@Getter
@Setter
@NoArgsConstructor
public class Session {
    private String id;
    private String agendaId;
    private String status;
    private LocalDateTime endDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
