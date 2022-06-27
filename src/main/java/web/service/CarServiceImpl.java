package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Tesla", "blue", 2));
        cars.add(new Car("BMW", "green", 4));
        cars.add(new Car("Audi", "black", 6));
        cars.add(new Car("Porsche", "red", 5));
        cars.add(new Car("Jeep", "gray", 10));
    }

    @Override
    public List<Car> getSeveralCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
