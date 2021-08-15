package com.booking.tenniscourt.service.tenniscourt;

import com.booking.tenniscourt.entity.tenniscourt.TennisCourt;
import com.booking.tenniscourt.entity.tenniscourt.TennisCourtDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TennisCourtMapper {
    TennisCourtDTO map(TennisCourt tennisCourt);

    @InheritInverseConfiguration
    TennisCourt map(TennisCourtDTO tennisCourtDTO);
}
