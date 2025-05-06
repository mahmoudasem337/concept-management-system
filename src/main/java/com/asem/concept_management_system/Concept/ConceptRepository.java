package com.asem.concept_management_system.Concept;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConceptRepository extends MongoRepository<Concept, String> {
    Optional<Concept> findByTitle(String title);
    Optional<Concept> findById(String id);
    List<ConceptResponse> findAllBy();
}