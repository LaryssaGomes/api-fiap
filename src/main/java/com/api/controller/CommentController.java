package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.DTO.CommentDTO;
import com.api.mapper.CommentMapper;
import com.api.model.Comment;
import com.api.model.Publication;
import com.api.repository.CommentRepository;
import com.api.repository.PublicationRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/publication/comment")
public class CommentController {
	
	@Autowired
	private PublicationRepository publicationRepository;
	
	@Autowired
	private CommentRepository commentRepository;
	
	private final CommentMapper commentMapper = CommentMapper.get();
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Comment> create(@RequestBody CommentDTO commentDTO, 
			@PathVariable(value="publicationId") Long publicacaoId) {
		
		Publication publication =  publicationRepository.findById(publicacaoId).orElse(null);
		
		Comment commentToSave = commentMapper.entity(commentDTO);
		
		commentToSave.setPulicacaoId(publication);
		
		commentRepository.save(commentToSave);
		return new ResponseEntity<>(commentToSave, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Comment> listar() {
		return commentRepository.findAll();
	}
}
