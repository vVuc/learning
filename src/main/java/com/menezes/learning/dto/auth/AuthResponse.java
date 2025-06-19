package com.menezes.learning.dto.auth;

import lombok.Data;

/**
 * Dto para resposta de autenticação
 */

@Data
public class AuthResponse {
    private String token;
    private String refreshToken;
    private String tokenType;
    private String expiresIn;
}
