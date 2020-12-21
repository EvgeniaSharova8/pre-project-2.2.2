package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.servise.CarsUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, Model model) {
        String requestParameter = request.getParameter("count");
        List<Car> carList = new CarsUtil().getListCar();
        List<Car> newCarList = new ArrayList<>();
        int count;
        if (requestParameter != null) {
            count = Integer.parseInt(requestParameter);
        } else {
            count = 5;
        }
        if (count > 5) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            newCarList.add(carList.get(i));
            model.addAttribute("car", newCarList);
        }
        return "car";
    }

}
