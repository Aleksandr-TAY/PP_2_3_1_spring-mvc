package web.Service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService{
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
    public List<Car> showCars(List<Car> list, int count) {
//        return list.stream().filter(Car -> Car.getId() <= count).collect(Collectors.toList());

        return count < 5 ?  list.subList(0, count) : list;
    }
}
