package com.menezes.learning.dto.agenda;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto para criação de agenda
 */

@Data
@NoArgsConstructor
public class AgendaRequest {
    @NotBlank(message = "Titulo é obrigatória")
    @Size(min = 3, max = 50, message = "Title must be between 3 and 50 characters")
    String title;

    @NotBlank(message = "Descrição é obrigatória")
    @Size(min = 10, max = 100, message = "Description must be between 10 and 100 characters")
    String description;
}
