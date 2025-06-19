package com.menezes.learning.dto.agenda;

import lombok.Data;

/**
 * Dto para resposta de agenda
 */

@Data
public class AgendaResponse {
    private String id;
    private String title;
    private String description;
    private String status;
    private String createdBy;
}