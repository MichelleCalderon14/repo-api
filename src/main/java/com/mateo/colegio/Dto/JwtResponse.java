package com.mateo.colegio.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class JwtResponse {
    private String token;
    private String type;
    private String username;
}
