package com.menezes.learning.dto.vote;

import com.menezes.learning.models.enums.VoteTypeEnum;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Dto para requisição de votação
 */
@Data
public class voteRequest {
    @NotBlank(message = "ID da sessão é obrigatório")
    private String sessionId;

    @NotBlank(message = "ID do usuário é obrigatório")
    private String userId;

    @NotBlank(message = "Status do voto é obrigatório")
    private VoteTypeEnum status;
}
