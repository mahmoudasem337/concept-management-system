package com.asem.concept_management_system.Concept;

import com.asem.concept_management_system.DTO.ConceptResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<List<ConceptResponse>> getAllConcepts() {
        return ResponseEntity.ok(conceptService.getAllConcepts());
    }

    @PostMapping
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<Void> createConcept(@Valid @RequestBody Concept concept) {
        conceptService.createConcept(concept);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<ConceptResponse> updateConcept(@PathVariable String id, @Valid @RequestBody Concept concept) {
        return ResponseEntity.ok(conceptService.updateConcept(id, concept));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<Void> deleteConcept(@PathVariable String id) {
        conceptService.deleteConcept(id);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/{title}")
    @PreAuthorize("hasRole('user')")
    public ResponseEntity<ConceptResponse> getConceptByTitle(@PathVariable String title) {
        return ResponseEntity.ok(conceptService.getConceptByTitle(title));
    }

} 