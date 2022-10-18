package com.rubens.crud.controller;

import com.rubens.crud.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    @ResponseBody
    public List<String> ola(){
        return produtoService.buscaTodosProdutos();
    }

    @PostMapping

}
