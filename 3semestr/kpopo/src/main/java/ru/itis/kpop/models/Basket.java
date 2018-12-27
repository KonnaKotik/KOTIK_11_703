package ru.itis.kpop.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basket {
    private Long id;
    private User user;
    private List<Merch> products;
}
