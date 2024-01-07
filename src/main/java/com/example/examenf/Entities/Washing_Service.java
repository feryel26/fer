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
@Table(name = "washing_Service")
public class Washing_Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idService;
    private Float price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @ManyToMany(mappedBy="washingServices"
            , cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
