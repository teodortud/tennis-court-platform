package com.booking.tenniscourt.entity.schedule;

import com.booking.tenniscourt.entity.reservation.Reservation;
import com.booking.tenniscourt.entity.tenniscourt.TennisCourt;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private TennisCourt tennisCourt;

    @OneToMany
    private List<Reservation> reservations;

    @NotNull
    private LocalDateTime startDateTime;

    @NotNull
    private LocalDateTime endDateTime;

    public void addReservation(Reservation reservation){
        if(reservation != null){
            if(reservations == null){
                reservations = new ArrayList<>();
            }
            reservations.add(reservation);
        }
    }
}
