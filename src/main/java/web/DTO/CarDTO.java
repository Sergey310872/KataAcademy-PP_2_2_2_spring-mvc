package web.DTO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDTO {
    private List<Car> listCars;

    public CarDTO() {
        listCars = new ArrayList<>();
        listCars.add(new Car("Ford", "Kuga", "2013"));
        listCars.add(new Car("Audi", "A6", "2020"));
        listCars.add(new Car("Peugeot", "308", "2015"));
        listCars.add(new Car("BMW", "X6", "2022"));
        listCars.add(new Car("Renault", "Logan", "2017"));
    }

    public List<Car> getCars(int count) {
        int n = count;
        n = n < 5 ? n : 5;
        n = n < 0 ? 0 : n;
        return listCars.subList(0, n);
    }
}
