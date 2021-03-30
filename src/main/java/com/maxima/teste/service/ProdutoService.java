package com.maxima.teste.service;


import com.maxima.teste.interfaces.IService;
import com.maxima.teste.model.Produto;
import com.maxima.teste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService implements IService<Produto, String> {

    @Autowired
    private ProdutoRepository repository;


    @Override
    public Produto save(Produto entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(String codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public List<Produto> findAll() {
        return repository.findAll();
    }

    @Override
    public Produto findById(String id) {
        return repository.findById(id).orElse(null);
    }
}
