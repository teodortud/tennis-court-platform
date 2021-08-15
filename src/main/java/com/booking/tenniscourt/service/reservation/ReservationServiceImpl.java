package com.booking.tenniscourt.service.reservation;

import com.booking.tenniscourt.entity.reservation.ReservationDTO;
import com.booking.tenniscourt.entity.reservation.ReservationStatus;
import com.booking.tenniscourt.repository.GuestRepository;
import com.booking.tenniscourt.repository.ReservationRepository;
import com.booking.tenniscourt.repository.ScheduleRepository;
import com.booking.tenniscourt.service.schedule.ScheduleMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService{
    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;

    private final ScheduleRepository scheduleRepository;
    private final ScheduleMapper scheduleMapper;

    private final GuestRepository guestRepository;

    public void bookReservation(int scheduleId, int guestId){
        if(scheduleRepository.findById(scheduleId).isEmpty()){
            throw new IllegalArgumentException("Cannot book on an invalid schedule!");
        }

        var scheduleDto = scheduleMapper.map(scheduleRepository.findById(scheduleId).get());

        var reservationDto = ReservationDTO.builder()
                .reservationStatus(ReservationStatus.READY_TO_PLAY)
                .schedule(scheduleDto)
                .guestId(guestId)
                .scheduleId(scheduleId)
                .priceValue(BigDecimal.valueOf(100))
                .refundValue(BigDecimal.valueOf(0))
                .build();

        var guest = guestRepository.findById(guestId).get();

        var reservation = reservationMapper.map(reservationDto);
        reservation.setGuest(guest);

        var schedule = scheduleMapper.map(scheduleDto);
        schedule.addReservation(reservation);

        reservationRepository.save(reservation);
    }
}
