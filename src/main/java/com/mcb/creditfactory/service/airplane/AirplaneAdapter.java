package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirPlaneDto;
import com.mcb.creditfactory.external.CollateralObject;
import com.mcb.creditfactory.external.CollateralType;
import com.mcb.creditfactory.model.Rate;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class AirplaneAdapter implements CollateralObject {

    AirPlaneDto airPlaneDto;

    @Override
    public Short getYear() {
        return airPlaneDto.getYear();
    }

    @Override
    public CollateralType getType() {
        return CollateralType.AIRPLANE;
    }

    @Override
    public List<Rate> getRate() {
        return airPlaneDto.getRates();
    }

}
