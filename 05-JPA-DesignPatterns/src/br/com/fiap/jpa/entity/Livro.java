package br.com.fiap.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_JPA_LIVRO")
@SuppressWarnings("serial")
@SequenceGenerator(name="livro",sequenceName="SQ_T_JPA_LIVRO", allocationSize=1)
public class Livro implements Serializable{

	@Id
	@Column(name="cd_livro")
	@GeneratedValue(generator="livro", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_titulo", nullable=false, length=150)
	private String titulo;
	
	@Column(name="nm_autor", nullable=false, length=150)
	private String autor;

	public Livro() {
		super();
		
	}

	public Livro( String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
