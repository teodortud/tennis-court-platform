package com.booking.tenniscourt.repository;

import com.booking.tenniscourt.entity.guest.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
