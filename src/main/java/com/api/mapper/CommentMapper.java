package com.api.mapper;

import com.api.DTO.CommentDTO;
import com.api.model.Comment;

public class CommentMapper {
	public static CommentMapper get() {
		return new  CommentMapper();
	}
	
	 public Comment entity(CommentDTO commenteDTO) {
		 Comment comment = new Comment();

		comment.setDescricao(commenteDTO.getDescricao());
        
        return comment;
	 }
	 
	 public CommentDTO dto(Comment comment) {
		 CommentDTO dto = new CommentDTO();

        dto.setDescricao(comment.getDescricao());
        
        return dto;
	 }
}
