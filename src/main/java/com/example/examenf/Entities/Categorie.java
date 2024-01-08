package com.example.examenf.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categorie")

public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategorie;
    private String codeCategorie;
    private String nomCategorie;

    @ManyToMany(mappedBy="categories", cascade = CascadeType.ALL)
    private Set<Evenement> evenements;

}
