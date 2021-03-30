package com.maxima.teste.controller;


import com.maxima.teste.interfaces.IRestController;
import com.maxima.teste.model.Produto;
import com.maxima.teste.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController implements IRestController<Produto, String> {


    @Autowired
    private ProdutoService produtoService;

    @Override
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Produto entity) {
        return ResponseEntity.ok(produtoService.save(entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        produtoService.delete(id);
    }

    @Override
    @GetMapping
    public List<Produto> findAll() {
        return produtoService.findAll();
    }


    @Override
    @GetMapping("/{id}")
    public Produto findById(@PathVariable String id) {
        return produtoService.findById(id);
    }
}
