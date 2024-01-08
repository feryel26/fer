package com.example.examenf.Repository;

import com.example.examenf.Entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEvenement extends JpaRepository<Evenement,Long> {
}
