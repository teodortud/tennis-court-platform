package com.booking.tenniscourt.service.reservation;

import com.booking.tenniscourt.entity.reservation.Reservation;
import com.booking.tenniscourt.entity.reservation.ReservationDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    Reservation map(ReservationDTO reservationDTO);

    @InheritInverseConfiguration
    ReservationDTO map(Reservation reservation);
}
