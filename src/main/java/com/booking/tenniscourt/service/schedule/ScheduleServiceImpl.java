package com.booking.tenniscourt.service.schedule;

import com.booking.tenniscourt.entity.schedule.ScheduleDTO;
import com.booking.tenniscourt.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private ScheduleRepository scheduleRepository;
    private ScheduleMapper scheduleMapper;

    public ScheduleDTO findScheduleById(int scheduleId){
        return scheduleMapper.map(scheduleRepository.findById(scheduleId).get());
    }
}
