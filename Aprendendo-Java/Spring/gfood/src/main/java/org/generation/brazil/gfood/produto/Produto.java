package org.generation.brazil.gfood.produto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Data

@Entity
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;
    private String descricao;
}
