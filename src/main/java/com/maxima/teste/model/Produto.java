package com.maxima.teste.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @Setter @Getter
    private String codigo;

    @Setter @Getter
    private String nome;
}
