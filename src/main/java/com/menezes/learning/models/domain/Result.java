package com.menezes.learning.models.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Result class
 * 
 * This class represents a result of a vote.
 * 
 */
@Getter
@Setter
@NoArgsConstructor
public class Result {
    private String id;
    private String agendaId;
    private String voteQuantity;
    private boolean approval;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
