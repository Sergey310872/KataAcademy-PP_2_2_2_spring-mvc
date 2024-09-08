package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCar;

import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    private ServiceCar serviceCar;

    @GetMapping(value = "/cars")
    public String listCars(@RequestParam("count") Optional<Integer> count, ModelMap model) {
        model.addAttribute("messages", serviceCar.getCars(count.orElse(5)));
        return "cars";
    }

}
