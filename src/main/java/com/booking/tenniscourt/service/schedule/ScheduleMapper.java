package com.booking.tenniscourt.service.schedule;

import com.booking.tenniscourt.entity.schedule.Schedule;
import com.booking.tenniscourt.entity.schedule.ScheduleDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {
    Schedule map(ScheduleDTO schedule);

    @InheritInverseConfiguration
    ScheduleDTO map(Schedule schedule);
}
