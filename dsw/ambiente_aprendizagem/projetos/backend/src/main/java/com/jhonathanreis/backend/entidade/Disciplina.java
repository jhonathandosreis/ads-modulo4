package com.jhonathanreis.backend.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	private String nome;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		
		if (nome == null) {
			throw new Exception("Disciplina inválida.");
		}
		if (nome.isEmpty() || nome.length() < 5) {
			throw new Exception("Disciplina inválida.");
		}
		
		this.nome = nome;
	}
}
