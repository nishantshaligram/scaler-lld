package com.scaler.BMS.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private String description;
    private int length;
    private double rating;
    @OneToMany
    private List<Show> shows;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection // M:M mapping
    @Enumerated(EnumType.STRING) // table to enum
    private List<Feature> movieFeatures;
    @ElementCollection // M:M mapping
    @Enumerated(EnumType.STRING) // table to enum
    private List<Language> languages;
}

// Relationship
// Movie : Shows -> 1:M
// Movie : Actor -> M:M
// Movie : Language -> M:M
// Movie : Feature -> M:M
