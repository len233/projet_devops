package com.example.projet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ServiceWeb {

    ArrayList<Car> cars = new ArrayList<>();

    public ServiceWeb() {
        cars.add(new Car("AA11BB", "ferrari", 2000));
        cars.add(new Car("BB22CC", "porsche", 1000));
        cars.add(new Car("CC33DD", "peugeot", 500));
        cars.add(new Car("DD44EE", "Lancia", 500));
    }

    @GetMapping("/cars/{plateNumber}")
    public Car getCarByPlate(@PathVariable("plateNumber") String plaque) {
        for (Car car : cars) {
            if (car.getPlateNumber().equalsIgnoreCase(plaque)) {
                return car;
            }
        }
        return null;
    }

    @GetMapping("/cars")
    public ArrayList<Car> getAllCars() {
        return cars;
    }
}
