package com.example.examenf.Repository;

import com.example.examenf.Entities.Reservation;
import com.example.examenf.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehicle extends JpaRepository<Vehicle,Long> {
}
