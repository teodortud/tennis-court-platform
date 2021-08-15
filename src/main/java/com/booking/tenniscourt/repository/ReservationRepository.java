package com.booking.tenniscourt.repository;

import com.booking.tenniscourt.entity.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
