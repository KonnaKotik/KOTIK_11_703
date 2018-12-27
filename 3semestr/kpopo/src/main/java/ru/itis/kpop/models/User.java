package ru.itis.kpop.models;

import lombok.*;



import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private Long id;

    private String email;
    private String hashPassword;
    private String rawPassword;

    private String firstName;
    private String lastName;
    private String address;

    private String fandom;

    private List<Order> orders;

    private Basket basket;
}
