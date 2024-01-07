package com.example.examenf.Repository;

import com.example.examenf.Entities.Reservation;
import com.example.examenf.Entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IReservation extends JpaRepository <Reservation,Long> {
    @Query("select r from Reservation r order by r.timereservation")
    List<Reservation> reservsbydate();
}
