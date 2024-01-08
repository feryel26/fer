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
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTicket;
    private String codeTicket;
    private Double prixTicket;

    @Enumerated(EnumType.STRING)
    private TypeTicket typeTicket;
    @ManyToOne
    Internaute internaute;
    @ManyToOne
    Evenement evenement;
}
