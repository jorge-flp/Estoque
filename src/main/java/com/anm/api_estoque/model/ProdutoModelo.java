package com.anm.api_estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name ="tb_produtos")
@Getter
@Setter
public class ProdutoModelo {
    @Id
    private Long id;
    private String nome;
    private Double preco;
    private String modelo;
    private String descricao;
}
