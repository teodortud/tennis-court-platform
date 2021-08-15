package com.booking.tenniscourt.service.schedule;

import com.booking.tenniscourt.entity.schedule.Schedule;
import com.booking.tenniscourt.entity.schedule.ScheduleDTO;

public interface ScheduleService {
    ScheduleDTO findScheduleById(int scheduleId);
}
