package ru.itis.kpop.forms;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PopularMerch {
    private Long idMerch;
    private int rating;
}
