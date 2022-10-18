package com.rubens.crud.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    public List<String> buscaTodosProdutos(){

        return List.of("Rubinho", "Diego", "Gustavo");

    }

}
