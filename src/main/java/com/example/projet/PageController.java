package com.example.projet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PageController {

    @GetMapping("/index")
    public String index(Model model) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("AA11BB", "ferrari", 2000));
        cars.add(new Car("BB22CC", "porsche", 1000));
        cars.add(new Car("CC33DD", "peugeot", 500));
        cars.add(new Car("DD44EE", "Lancia", 500));

        model.addAttribute("cars", cars);
        return "index";
    }
}
