package com.jhonathanreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathanreis.backend.entidade.Disciplina;

public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}
