package com.jhonathanreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathanreis.backend.entity.Curso;

public interface CursoDao extends JpaRepository<Curso, Long> {

}
