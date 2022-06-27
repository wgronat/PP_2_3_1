package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String getSeveralCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        if (count > 5) {
            count = 5;
        }
        model.addAttribute("severalCars", carService.getSeveralCars(count));
        return "cars";
    }
}
