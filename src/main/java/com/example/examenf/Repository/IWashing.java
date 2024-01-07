package com.example.examenf.Repository;

import com.example.examenf.Entities.Reservation;
import com.example.examenf.Entities.Vehicle;
import com.example.examenf.Entities.Washing_Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWashing extends JpaRepository<Washing_Service,Long> {
}
