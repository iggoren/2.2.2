package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDao carDao;

    @Autowired
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String showListCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carDao.listCars());
        } else {
            model.addAttribute("cars", carDao.showCars(count));
        }
        return "cars";
    }
}
