package org.generation.brazil.loja.controller;

import org.generation.brazil.loja.dao.ProdutoDAO;
import org.generation.brazil.loja.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoDAO produtoDAO;

    @RequestMapping("/produtos")
    public List<Produto> lista(){

        List<Produto> produtos = (List<Produto>) produtoDAO.findAll();

        return (List<Produto>) produtos;
    }
}
