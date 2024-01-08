package com.example.examenf.Repository;

import com.example.examenf.Entities.Internaute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IInternaute extends JpaRepository <Internaute,Long> {
   // @Query("select r from Internaute r order by r.timereservation")
   // List<Internaute> reservsbydate();
}
