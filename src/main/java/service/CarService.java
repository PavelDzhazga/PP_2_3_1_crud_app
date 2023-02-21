package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    List<Car> getListCars();
    List<Car> getCarByCount(List<Car> carList, int count);
}
