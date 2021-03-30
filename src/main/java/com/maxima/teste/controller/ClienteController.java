package com.maxima.teste.controller;


import com.maxima.teste.interfaces.IRestController;
import com.maxima.teste.model.Cliente;
import com.maxima.teste.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController implements IRestController<Cliente, String> {

    @Autowired
    private ClienteService clienteService;


    @Override
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Cliente entity) {
        return ResponseEntity.ok(clienteService.save(entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        clienteService.delete(id);
    }

    @Override
    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Cliente findById(@PathVariable String id) {
        return clienteService.findById(id);
    }
}
