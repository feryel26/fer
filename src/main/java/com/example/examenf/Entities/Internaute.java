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
@Table(name = "internaute")
public class Internaute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idInternaute;
    private String identifiant;

    @Enumerated(EnumType.STRING)
    private TrancheAge trancheAge;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="internaute")
    private Set<Ticket> Tickets;

}
