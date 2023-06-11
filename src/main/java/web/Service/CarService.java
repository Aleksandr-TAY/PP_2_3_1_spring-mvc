package web.Service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> showAllCars();
    public List<Car> showFromOneTillFourCars(int count);
}
