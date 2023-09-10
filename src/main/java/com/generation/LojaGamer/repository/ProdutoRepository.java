package com.generation.LojaGamer.repository;

import com.generation.LojaGamer.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAllByNomeContainingIgnoreCase(@Param("Nome") String nome);
    
    public List<Produto> findAllByGeneroContainingIgnoreCase(@Param("Genero") String genero);


}
