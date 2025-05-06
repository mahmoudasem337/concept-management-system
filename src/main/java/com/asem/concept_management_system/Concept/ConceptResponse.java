package com.asem.concept_management_system.Concept;

public class ConceptResponse {
    private String title;
    private String description;
    private Integer difficultyLevel;
    private ProgressStatus status;

    public ConceptResponse() {
    }

    public ConceptResponse(String title, String description, Integer difficultyLevel, ProgressStatus status) {
        this.title = title;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDifficultyLevel(Integer difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public ProgressStatus getStatus() {
        return status;
    }

    public void setStatus(ProgressStatus status) {
        this.status = status;
    }
}
