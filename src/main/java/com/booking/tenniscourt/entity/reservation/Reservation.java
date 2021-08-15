package com.booking.tenniscourt.entity.reservation;

import com.booking.tenniscourt.entity.guest.Guest;
import com.booking.tenniscourt.entity.schedule.Schedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Guest guest;

    @ManyToOne
    private Schedule schedule;

    private BigDecimal priceValue;

    private BigDecimal refundValue;

    @NotNull
    private ReservationStatus reservationStatus;
}

