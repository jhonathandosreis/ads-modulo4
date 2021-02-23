package com.jhonathanreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathanreis.backend.entidade.Turma;

public interface TurmaDao extends JpaRepository<Turma, Long> {

}
