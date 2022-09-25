package com.api.DTO;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class CommentDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "O campo comentario não pode ser nullo")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
