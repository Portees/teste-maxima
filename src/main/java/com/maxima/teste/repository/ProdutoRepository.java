package com.maxima.teste.repository;

import com.maxima.teste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String>{

}
