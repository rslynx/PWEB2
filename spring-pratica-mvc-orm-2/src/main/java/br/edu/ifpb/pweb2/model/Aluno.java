package br.edu.ifpb.pweb2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Aluno {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nome;
	private long matricula;
	private String curso;
	
	
	
	public Aluno() {}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public long getMatricula() {
		return matricula;
	}



	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
}
