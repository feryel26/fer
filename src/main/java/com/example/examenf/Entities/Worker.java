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
@Table(name = "worker")

public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAgent;
    private String name;
    private String nic;
    @ManyToOne
    Reservation reservation;
}
