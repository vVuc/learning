package com.menezes.learning.models.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Vote class
 * 
 * This class represents a vote of a user in an agenda.
 * 
 */
@Getter
@Setter
@NoArgsConstructor
public class Vote {
    private String id;
    private String agendaId;
    private String userId;
    private String sessionId;
    private boolean approval;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
