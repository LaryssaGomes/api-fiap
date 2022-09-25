package com.api.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Publication {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column()
	private String nome;
	
	@Column()
	private String descricao;
	
	@Column ()
	private String url;
	
	@Column ()
	private Long curtidas;
	
	@OneToMany(mappedBy="publicacaoId", cascade = CascadeType.ALL)
	private  Set<Comment> comment;
	
	public Set<Comment> getComment() {
		return comment;
	}
	
	public void setComment(Set<Comment> comment) {
		this.comment = comment;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Long curtidas) {
		this.curtidas = curtidas;
	}
	
	

}
