package web.Service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car(++CARS_COUNT, "Honda", "Stream"));
        carsList.add(new Car(++CARS_COUNT, "Toyota", "Wish"));
        carsList.add(new Car(++CARS_COUNT, "Lada", "Kalina"));
        carsList.add(new Car(++CARS_COUNT, "Mercedes", "600"));
        carsList.add(new Car(++CARS_COUNT, "Opel", "Astra"));
    }

    @Override
    public List<Car> showAllCars() {
        return carsList;
    }

    @Override
    public List<Car> showFromOneTillFourCars(int count) {
        return count < 5 ? showAllCars().subList(0, count) : showAllCars();
    }
}
