package com.asem.concept_management_system.Concept;

import com.asem.concept_management_system.DTO.ConceptResponse;
import com.asem.concept_management_system.Exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConceptService {

    private final ConceptRepository conceptRepository;
    public ConceptService(ConceptRepository conceptRepository) {
        this.conceptRepository = conceptRepository;
    }

    public List<ConceptResponse> getAllConcepts() {
        return conceptRepository.findAllBy();
    }

    public void createConcept(Concept concept) {
        conceptRepository.save(concept);
    }

    public ConceptResponse updateConcept(String id, Concept updatedData) {
        Concept existing = conceptRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Concept not found"));
        existing.setTitle(updatedData.getTitle());
        existing.setDescription(updatedData.getDescription());
        existing.setDifficultyLevel(updatedData.getDifficultyLevel());
        ConceptResponse response = new ConceptResponse(existing.getTitle(), existing.getDescription(), existing.getDifficultyLevel());
        conceptRepository.save(existing);
        return response;
    }

    public boolean deleteConcept(String id) {
        if (!conceptRepository.existsById(id)) {
            throw new ResourceNotFoundException("Concept not found");
        }
        conceptRepository.deleteById(id);
        return true;
    }

    public ConceptResponse getConceptByTitle(String title) {
        return conceptRepository.findByTitle(title)
                .orElseThrow(() -> new ResourceNotFoundException("Concept not found"));
    }
} 