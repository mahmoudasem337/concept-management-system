package com.asem.concept_management_system.Concept;

import com.asem.concept_management_system.DTO.ConceptResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConceptRepository extends MongoRepository<Concept, String> {
    Optional<ConceptResponse> findByTitle(String title);
    List<ConceptResponse> findAllBy();
}