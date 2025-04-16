package com.asem.concept_management_system.DTO;

public class ConceptResponse {
    private String title;
    private String description;
    private Integer difficultyLevel;

    public ConceptResponse() {
    }

    public ConceptResponse(String title, String description, Integer difficultyLevel) {
        this.title = title;
        this.description = description;
        this.difficultyLevel = difficultyLevel;
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
}
