package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl {

    public static List<Car> getCars(List<Car> carList, int count) {
        if (count >= 0) {
            return carList.subList(0, count);
        } else {
            return carList;
        }
    }
}
