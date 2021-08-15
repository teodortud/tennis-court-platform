package com.booking.tenniscourt.entity.reservation;

import com.booking.tenniscourt.entity.schedule.ScheduleDTO;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ReservationDTO {
    private int id;

    private ScheduleDTO schedule;

    @NotNull
    private int scheduleId;

    @NotNull
    private int guestId;

    private BigDecimal priceValue;

    private BigDecimal refundValue;

    @NotNull
    private ReservationStatus reservationStatus;
}
