package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private int count;

    private final static List<Car> carOnList = List.of(
            new Car("BMW", "White", 1999),
            new Car("Opel", "Black", 2012),
            new Car("Audi", "Blue", 2000),
            new Car("Lada", "Pink", 2015),
            new Car("Mazda", "White", 1976)
    );


    @Override
    public List<Car> getListCars(int count) {
        if (count > 0 && count < carOnList.size()) {
            return carOnList.subList(0, count);
        }
        return carOnList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCar() {
        return carOnList;
    }
}
