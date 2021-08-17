package com.booking.tenniscourt.service;

import com.booking.tenniscourt.entity.guest.Guest;
import com.booking.tenniscourt.entity.reservation.Reservation;
import com.booking.tenniscourt.entity.reservation.ReservationStatus;
import com.booking.tenniscourt.entity.schedule.Schedule;
import com.booking.tenniscourt.entity.tenniscourt.TennisCourt;
import com.booking.tenniscourt.service.reservation.ReservationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = ReservationService.class)
public class ReservationServiceTest {
    @Test
    public void checkReservationServiceMapperForSaving(){
        var schedule = new Schedule();
        schedule.setId(1);

        LocalDateTime startDateTime = LocalDateTime.now().plusDays(2);
        LocalDateTime endDateTime = LocalDateTime.now().plusDays(10);

        schedule.setStartDateTime(startDateTime);
        schedule.setEndDateTime(endDateTime);

        var tennisCourt = new TennisCourt();
        tennisCourt.setName("Wimbledon");

        schedule.setTennisCourt(tennisCourt);

        var reservation = new Reservation();
        reservation.setReservationStatus(ReservationStatus.READY_TO_PLAY);
        reservation.setPriceValue(BigDecimal.valueOf(100));
        reservation.setRefundValue(null);
        reservation.setSchedule(schedule);

        var guest = new Guest();
        guest.setId(1);
        guest.setName("John Travolta");

        reservation.setGuest(guest);

        schedule.addReservation(reservation);

        Assertions.assertNotNull(reservation);
    }
}
