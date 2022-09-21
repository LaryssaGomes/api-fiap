package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Publication;
import com.api.repository.PublicationRepository;

@RestController
@RequestMapping("/publication")
public class PublicationController {
	
	@Autowired
	private PublicationRepository publicationRepository;
	
	@GetMapping
	public List<Publication> listar() {
		return publicationRepository.findAll();
	}

}
