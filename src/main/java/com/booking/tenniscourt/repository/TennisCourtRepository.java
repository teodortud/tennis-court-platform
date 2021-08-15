package com.booking.tenniscourt.repository;

import com.booking.tenniscourt.entity.tenniscourt.TennisCourt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TennisCourtRepository extends JpaRepository<TennisCourt, Integer> {
}
