package com.maxima.teste.service;

import com.maxima.teste.interfaces.IService;
import com.maxima.teste.model.Cliente;
import com.maxima.teste.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IService<Cliente, String> {


    @Autowired
    private ClienteRepository repository;


    public Cliente save(Cliente entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(String codigo) {
        repository.deleteById(codigo);
    }

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Cliente findById(String id) {
        return repository.findById(id).orElse(null);
    }


}
