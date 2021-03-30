package com.maxima.teste.service;

import com.maxima.teste.interfaces.IService;
import com.maxima.teste.model.Vendedor;
import com.maxima.teste.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendedorService implements IService<Vendedor, String> {

    @Autowired
    private VendedorRepository repository;


    @Override
    public Vendedor save(Vendedor entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(String codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public List<Vendedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Vendedor findById(String id) {
        return repository.findById(id).orElse(null);
    }
}
