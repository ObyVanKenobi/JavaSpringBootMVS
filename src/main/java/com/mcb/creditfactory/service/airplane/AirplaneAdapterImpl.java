package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirPlaneDto;
import com.mcb.creditfactory.external.ExternalApproveService;
import com.mcb.creditfactory.model.AirPlane;
import com.mcb.creditfactory.repository.AirPlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AirplaneAdapterImpl  implements AirplaneService{


    @Autowired
    private ExternalApproveService approveService;

    @Autowired
    private AirPlaneRepository airPlaneRepository;


    @Override
    public boolean approve(AirPlaneDto dto) {
        return approveService.approve(new AirplaneAdapter(dto)) == 0;
    }

    @Override
    public AirPlane save(AirPlane airPlane) {
        return airPlaneRepository.save(airPlane);
    }

    @Override
    public Optional<AirPlane> load(Long id) {
        return airPlaneRepository.findById(id);
    }

    @Override
    public AirPlane fromDto(AirPlaneDto dto) {
          return new AirPlane(
                dto.getId(),
                dto.getBrand(),
                dto.getModel(),
                dto.getPower(),
                dto.getYear(),
                dto.getRates()
        );
    }

    @Override
    public AirPlaneDto toDTO(AirPlane airPlane) {
         return new AirPlaneDto(
                airPlane.getId(),
                airPlane.getBrand(),
                airPlane.getModel(),
                airPlane.getPower(),
                airPlane.getYear(),
                airPlane.getRates()
        );
    }

    @Override
    public Long getId(AirPlane airPlane) {
        return airPlane.getId();
    }
}
