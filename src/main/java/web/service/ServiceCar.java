package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DTO.CarDTO;
import web.model.Car;

import java.util.List;

@Service
public class ServiceCar {
    @Autowired
    private CarDTO carDTO;

    public List<Car> getCars(int count){
        return carDTO.getCars(count);
    }
}
