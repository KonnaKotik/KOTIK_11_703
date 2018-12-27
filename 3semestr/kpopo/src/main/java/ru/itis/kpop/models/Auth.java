package ru.itis.kpop.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Auth {
    private Long id;
    private String cookieValue;
    private Long user_id;
}
