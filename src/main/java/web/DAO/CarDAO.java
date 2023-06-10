package web.DAO;

import web.models.Car;

import java.util.List;

public class CarDAO {
    private static int CARS_COUNT;
    private List<Car> list;
    {
        list.add(new Car(++CARS_COUNT, "Honda", "Stream"));
    }
}
