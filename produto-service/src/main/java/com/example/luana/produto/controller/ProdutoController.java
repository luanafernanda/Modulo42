package com.example.luana.produto.controller;

import com.example.luana.produto.model.Produto;
import com.example.luana.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto alterarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.alterarProduto(id, produto);
    }

    @GetMapping("/{id}")
    public Produto pesquisarProduto(@PathVariable Long id) {
        return produtoService.pesquisarProduto(id);
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }
}
