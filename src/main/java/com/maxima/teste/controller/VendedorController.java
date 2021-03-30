package com.maxima.teste.controller;


import com.maxima.teste.interfaces.IRestController;


import com.maxima.teste.model.Vendedor;

import com.maxima.teste.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController implements IRestController<Vendedor, String> {

    @Autowired
    private VendedorService vendedorService;

    @Override
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Vendedor entity) {
        return ResponseEntity.ok(vendedorService.save(entity));
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        vendedorService.delete(id);
    }

    @Override
    @GetMapping
    public List<Vendedor> findAll() {
        return vendedorService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Vendedor findById(@PathVariable String id) {
        return vendedorService.findById(id);
    }
}
