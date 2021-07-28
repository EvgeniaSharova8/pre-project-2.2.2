package web.service;

import org.springframework.stereotype.Service;
import web.CarsAdd;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(int parameter) {
        return new CarsAdd().getCarList(parameter);
    }
}
