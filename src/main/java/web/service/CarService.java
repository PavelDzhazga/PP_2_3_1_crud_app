package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    List<Car> getCarByCount(int count);
}
