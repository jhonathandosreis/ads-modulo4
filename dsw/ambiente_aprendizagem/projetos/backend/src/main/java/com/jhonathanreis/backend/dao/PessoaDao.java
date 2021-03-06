package com.jhonathanreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhonathanreis.backend.entity.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long> {

}