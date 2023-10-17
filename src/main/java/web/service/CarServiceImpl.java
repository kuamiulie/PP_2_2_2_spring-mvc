package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    public static List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Nissan", 33, "A.Cavanaugh"));
        cars.add(new Car("Mercedes", 65, "B.Sidodrov"));
        cars.add(new Car("Toyota", 44, "T.Miller"));
        cars.add(new Car("Lamborghini", 505, "E.Smith"));
        cars.add( new Car("Lada", 33, "V.Pupkin"));
    }

    @Override
    public List<Car> numberCars(Integer numCars) {
        List<Car> resCarList = new ArrayList<>();
        if (numCars == null) {
            return cars;
        } else {
            for (int i = 0; i < numCars; i++) {
                resCarList.add(cars.get(i));
            }
            return resCarList;
        }
    }
}
