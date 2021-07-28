package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarsController {

    private CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest parameter, ModelMap modelMap) {
        String requestParameter = parameter.getParameter("count");
        int count;
        if (requestParameter != null) {
            count = Integer.parseInt(requestParameter);
        } else {
            count = 5;
        }
        List<Car> carList = carService.getCarList(count);
        modelMap.addAttribute("cars", carList);
        return "cars";
    }
}
