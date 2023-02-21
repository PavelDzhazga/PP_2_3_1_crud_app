package controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCar(@RequestParam(value = "count", required = false) int count, Model model) {
        List<Car> carLists = null;
        List<Car> allCars = carService.getListCars();

        if (count > 0 && count < allCars.size()) {
            carLists = carService.getCarByCount(allCars, count);
        }
        model.addAttribute("carList", carLists);
        return "cars";
    }
}
