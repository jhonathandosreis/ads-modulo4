package com.jhonathanreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathanreis.backend.entidade.Curso;

public interface CursoDao extends JpaRepository<Curso, Long> {

}
