package com.example.examenf.Repository;

import com.example.examenf.Entities.Vehicle;
import com.example.examenf.Entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IWorker extends JpaRepository<Worker,Long> {
}
