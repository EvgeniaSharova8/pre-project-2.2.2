package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListAdd {

    private List<Car> carList = new ArrayList<>();

    Car car1 = new Car("aaaaa", 11111, 111);
    Car car2 = new Car("bbbbb", 22222, 222);
    Car car3 = new Car("ccccc", 33333, 333);
    Car car4 = new Car("ddddd", 44444, 444);
    Car car5 = new Car("eeeee", 55555, 555);

    {
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
