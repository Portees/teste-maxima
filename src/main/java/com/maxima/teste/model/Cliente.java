package com.maxima.teste.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class
Cliente {

    @Id
    @Getter
    @Setter
    private String codigo;

    @Setter @Getter
    private String nome;

}
