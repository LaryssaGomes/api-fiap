package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Publication;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long>{

}
