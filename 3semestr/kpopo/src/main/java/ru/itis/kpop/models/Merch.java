package ru.itis.kpop.models;

import lombok.*;



@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Merch {
   private  String name;
   private Long id;
   private Double price;
   private String img;
}
