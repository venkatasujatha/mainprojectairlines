package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
