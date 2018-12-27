package ru.itis.kpop.forms;


import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UniqMerch {
    private Long idMerch;
    private String nameMerch;
    private String img;
    private Double price;
    private Integer countMerch;


}
