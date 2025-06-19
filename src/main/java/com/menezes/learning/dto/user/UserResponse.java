package com.menezes.learning.dto.user;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * Dto para resposta de usuário
 */

@Data
public class UserResponse {
    private String id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}