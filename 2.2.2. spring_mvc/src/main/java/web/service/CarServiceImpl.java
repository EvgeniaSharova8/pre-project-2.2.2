package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();
    private List<Car> addCarList = addCarList(carList);

    private List<Car> addCarList(List<Car> carList) {
        carList.add(new Car("firm1", "model1", 1111));
        carList.add(new Car("firm2", "model2", 2222));
        carList.add(new Car("firm3", "model3", 3333));
        carList.add(new Car("firm4", "model4", 4444));
        carList.add(new Car("firm5", "model5", 5555));

        return carList;
    }

    @Override
    public List<Car> getCarList(int parameter) {
        if (parameter < 5) {
            return addCarList.subList(0, parameter);
        } else {
            return addCarList.subList(0, 5);
        }
    }
}
