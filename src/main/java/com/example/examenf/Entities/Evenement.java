package com.example.examenf.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "evenement")
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEvenement;
    private String nomEvenement;
    private Long nbPlacesRestants;
    private LocalDate dateEvenement;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="evenement")
    private Set<Ticket> Tickets;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Categorie> categories;

}
