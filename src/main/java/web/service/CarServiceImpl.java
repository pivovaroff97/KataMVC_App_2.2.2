package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> carList = new ArrayList<>(){{
        add(new Car("BMW", "X", 5));
        add(new Car("BMW", "X", 3));
        add(new Car("Opel", "Astra", 1));
        add(new Car("Audi", "A", 8));
        add(new Car("Audi", "A", 7));
    }};

    public List<Car> getCars(int count) {
        if (count >= 0) {
            return carList.subList(0, count);
        } else {
            return carList;
        }
    }
}
