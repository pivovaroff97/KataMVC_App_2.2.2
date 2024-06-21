package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    List<Car> carList = new ArrayList<>(){{
        add(new Car("BMW", "X", 5));
        add(new Car("BMW", "X", 3));
        add(new Car("Opel", "Astra", 1));
        add(new Car("Audi", "A", 8));
        add(new Car("Audi", "A", 7));
    }};

    @GetMapping
    public String getCars(ModelMap modelMap,
                          @RequestParam(required = false, name = "count", defaultValue = "-1") int count) {
        modelMap.addAttribute("cars", CarServiceImpl.getCars(carList, count));
        return "cars";
    }
}
