package ru.itis.kpop.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Order {
    private Long id;
    private LocalDateTime date;
    private User client;
    private List<Merch> merch;
    private char status;
}
