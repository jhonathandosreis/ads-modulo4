package com.jhonathanreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathanreis.backend.entity.Turma;

public interface TurmaDao extends JpaRepository<Turma, Long> {

}
