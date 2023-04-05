package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    public static List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("testModel", 1, "a111aa"));
        carList.add(new Car("testModel", 2, "a222aa"));
        carList.add(new Car("testModel", 3, "a333aa"));
        carList.add(new Car("testModel", 4, "a444aa"));
        carList.add(new Car("testModel", 5, "a555aa"));
    }

    @Override
    public List<Car> getCars(List<Car> carList, int count) {
        return carList.stream().limit(count).toList();
    }
}
