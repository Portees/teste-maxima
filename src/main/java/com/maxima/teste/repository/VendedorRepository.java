package com.maxima.teste.repository;

import com.maxima.teste.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, String> {
}
