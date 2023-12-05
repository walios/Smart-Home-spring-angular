package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Appareil {
    //id label description state

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;

    private String label;
    private String description;
    private Boolean state;

    @ManyToOne
    @JsonIdentityReference(alwaysAsId = true)
    private Category category;
}

