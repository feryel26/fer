package com.example.examenf.Repository;

import com.example.examenf.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicket extends JpaRepository<Ticket,Long> {
}
