package web.Service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> showCars(List<Car> list, int count);
}
