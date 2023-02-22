package web.controller;

import web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5", required = false) int count, Model model) {
        model.addAttribute("cars", carService.getCarByCount(count));
        return "cars";
    }
}
