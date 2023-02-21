package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carOnList;

    {
        carOnList = new ArrayList<>();
        new Car("BMW", "White", 1999);
        new Car("Opel", "Black", 2012);
        new Car("Audi", "Blue", 2000);
        new Car("Lada", "Pink", 2015);
        new Car("Mazda", "White", 1976);
    }


    @Override
    public List<Car> getListCars() {
        return carOnList;
    }

    @Override
    public List<Car> getCarByCount(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
