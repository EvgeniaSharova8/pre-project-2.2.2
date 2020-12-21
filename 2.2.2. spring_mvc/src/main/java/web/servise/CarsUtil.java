package web.servise;

import web.CarsListAdd;
import web.model.Car;

import java.util.List;

public class CarsUtil {
    public List<Car> getListCar(){
        return new CarsListAdd().getCarList();
    }
}
