package web.dao;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private final List<Car> carList = new ArrayList<>();


  {
        carList.add(new Car("vaz", "white","2109"));
        carList.add(new Car("uaz", "green","patriot"));
        carList.add(new Car("kia", "blue","sportage"));
        carList.add(new Car("bmw", "black","x6"));
        carList.add(new Car("toyota", "red","camry"));
    }

    public List<Car> listCars() {
        return carList;
    }

    //public Car showCar(int count){

    }




