package com.rubenmoya.reservas_service.reservation;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByReservationTimeBetween(LocalDateTime from, LocalDateTime to);
}