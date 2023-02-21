package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", "White", 1999));
        cars.add(new Car("Opel", "Black", 2012));
        cars.add(new Car("Audi", "Blue", 2000));
        cars.add(new Car("Lada", "Pink", 2015));
        cars.add(new Car("Mazda", "White", 1976));
    }

    @Override
    public List<Car> getCarByCount(int count) {
        if (count > 0 && count < 5) {
            return cars.stream().limit(count).toList();
        } else {
            return cars;
        }
    }
}
