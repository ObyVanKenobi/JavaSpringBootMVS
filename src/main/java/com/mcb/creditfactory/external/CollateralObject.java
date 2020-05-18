package com.mcb.creditfactory.external;

import com.mcb.creditfactory.model.Rate;

import java.util.List;


public interface CollateralObject {
    Short getYear();
    CollateralType getType();
    List<Rate> getRate();

}
