package com.api.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column()
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "publication_id")
	@JsonBackReference
	private Publication publicacaoId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Publication getPulicacaoId() {
		return publicacaoId;
	}

	public void setPulicacaoId(Publication publicacaoId) {
		this.publicacaoId = publicacaoId;
	}
	
	
	
}