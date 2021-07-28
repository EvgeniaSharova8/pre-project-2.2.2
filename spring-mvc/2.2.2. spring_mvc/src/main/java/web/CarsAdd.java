package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsAdd {
    public static List<Car> getCarList(int count) {
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car("firm1", "model1", 1111);
        Car car2 = new Car("firm2", "model2", 2222);
        Car car3 = new Car("firm3", "model3", 3333);
        Car car4 = new Car("firm4", "model4", 4444);
        Car car5 = new Car("firm5", "model5", 5555);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        while (count < carList.size()) {
            carList.remove(carList.size() - 1);
        }


        return carList;
    }
}
