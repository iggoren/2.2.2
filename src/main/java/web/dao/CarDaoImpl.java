package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{

    private final List<Car> carList = new ArrayList<>();

    @Override
    public void add(Car car) {
        carList.add(new Car("vaz", "white","2109"));
        carList.add(new Car("uaz", "green","patriot"));
        carList.add(new Car("kia", "blue","sportage"));
        carList.add(new Car("bmw", "black","x6"));
        carList.add(new Car("toyota", "red","camry"));
    }



    @Override
    public List<Car> listCars() {
        return null;
    }
}
