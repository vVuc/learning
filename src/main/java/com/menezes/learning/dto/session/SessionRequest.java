package com.menezes.learning.dto.session;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto para requisição de sessão
 */

@NoArgsConstructor
@Data
public class SessionRequest {

    @NotBlank(message = "ID da pauta é obrigatório")
    private String agendaId;

    @NotBlank(message = "Duração da sessão é obrigatória")
    private Integer duration;
}