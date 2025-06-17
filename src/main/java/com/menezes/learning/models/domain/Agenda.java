package com.menezes.learning.models.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Agenda class
 * 
 * This class represents an agenda item.
 * 
 */
@Getter
@Setter
@NoArgsConstructor
public class Agenda {
    private String id;
    private String title;
    private String description;
    private String status;
    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
