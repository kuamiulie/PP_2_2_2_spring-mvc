package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        CarServiceImpl carService = new CarServiceImpl();
        model.addAttribute("cars", carService.numberCars(count));
        return "cars";
    }
}
