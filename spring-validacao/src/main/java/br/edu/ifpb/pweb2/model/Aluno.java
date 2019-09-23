package br.edu.ifpb.pweb2.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Aluno {
	
	@NotEmpty(message="Nome é obrigatório")
	@Size(max=5, message = "Tamanho inválido")
	public String nome;
	public long matricula;	
	public String curso;
	@DateTimeFormat
	public Date dataNasc;
	public BigDecimal cre;
	
	public Aluno() {}
	
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
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public BigDecimal getCre() {
		return cre;
	}
	public void setCre(BigDecimal cre) {
		this.cre = cre;
	}
	
	
	
}
