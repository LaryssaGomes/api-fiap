package com.api.controller;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.api.model.Publication;
import com.api.repository.PublicationRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/publication")
@CrossOrigin("*")
@Slf4j
public class PublicationController {
	
	@Autowired
	private PublicationRepository publicationRepository;
	
	@GetMapping
	public List<Publication> listar() {
		return publicationRepository.findAll();
	}
	
	@PostMapping
	public Publication create(@RequestBody Publication publication) {
		return publicationRepository.save(publication);
	}
	
	

	public String salvarArquivo(@RequestParam("file")MultipartFile file){
		System.out.println("Recebendo o arquivo" + file.getOriginalFilename());
		var path = "/home/teco/temp/arquivos";
		var caminho = path + UUID.randomUUID() + "."+ extrairExtensao(file.getOriginalFilename());
		return "fgfg";
	}
	
	private String extrairExtensao(String originalFilename) {
		int i = originalFilename.lastIndexOf(".");
		return originalFilename.substring(i+1);
		
	}

}
