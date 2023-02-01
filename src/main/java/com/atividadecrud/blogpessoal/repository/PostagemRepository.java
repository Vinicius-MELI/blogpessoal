package com.atividadecrud.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.atividadecrud.blogpessoal.model.Postagem;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    List <Postagem> findAllByTituloContainingIgnoreCase(@Param("título") String titulo);
}