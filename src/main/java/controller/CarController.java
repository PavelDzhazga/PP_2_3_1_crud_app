package controller;

import service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("carOnList", carService.getListCars(count));
        return "cars";
    }
}
