package web.Service;

import web.models.Car;

import java.util.List;

public interface CarService {
    void createCarsTable();

    void dropCarsTable();

    void saveCar(String name, String lastName, byte age);

    void removeCarById(long id);

    List<Car> getAllCars();

    void cleanCarsTable();
}
