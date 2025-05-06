package com.asem.concept_management_system.Concept;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concepts")
public class ConceptController {
    private final ConceptService conceptService;
    public ConceptController(ConceptService conceptService) {
        this.conceptService = conceptService;
    }

    @GetMapping
    public ResponseEntity<List<ConceptResponse>> getAllConcepts() {
        return ResponseEntity.ok(conceptService.getAllConcepts());
    }

    @PostMapping
    public ResponseEntity<Void> createConcept(@Valid @RequestBody Concept concept) {
        conceptService.createConcept(concept);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConceptResponse> updateConcept(@PathVariable String id, @Valid @RequestBody Concept concept) {
        return ResponseEntity.ok(conceptService.updateConcept(id, concept));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteConcept(@PathVariable String id) {
        conceptService.deleteConcept(id);
        return ResponseEntity.ok(conceptService.deleteConcept(id));
    }
    
    @GetMapping("/{title}")
    public ResponseEntity<ConceptResponse> getConceptByTitle(@PathVariable String title) {
        return ResponseEntity.ok(conceptService.getConceptByTitle(title));
    }

} 