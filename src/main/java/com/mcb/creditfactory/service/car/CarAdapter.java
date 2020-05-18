package com.mcb.creditfactory.service.car;

import com.mcb.creditfactory.dto.CarDto;
import com.mcb.creditfactory.external.CollateralObject;
import com.mcb.creditfactory.external.CollateralType;
import com.mcb.creditfactory.model.Rate;
import lombok.AllArgsConstructor;

import java.util.List;


@AllArgsConstructor
public class CarAdapter implements CollateralObject {
    private CarDto car;


    @Override
    public Short getYear() {
        return car.getYear();
    }

    @Override
    public CollateralType getType() {
        return CollateralType.CAR;
    }

    @Override
    public List<Rate> getRate() {
        return car.getRate();
    }
}
