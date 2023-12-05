package com.example.demo.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Category {
    //id label
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id ;
    private String label;

    @OneToMany (targetEntity = Appareil.class,mappedBy = "category",fetch= FetchType.LAZY)
    private List<Appareil> appareils;
}
