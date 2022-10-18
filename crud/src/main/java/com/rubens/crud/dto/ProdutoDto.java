package com.rubens.crud.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProdutoDto {

    private String nome;
    private Double preco;
    private String categoria;



}
