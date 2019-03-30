package pl.sdacademy.javaktw9.carRental.controller;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.javaktw9.carRental.model.City;
import pl.sdacademy.javaktw9.carRental.repository.CarRepository;
import pl.sdacademy.javaktw9.carRental.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cars")
public class CarController {

    private CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/{location}")
    public List<Car> getCarsFromLocation (@PathVariable String location) {
        return carRepository.findAll().stream().filter(car -> car.getLocation().equalsIgnoreCase(location)).collect(Collectors.toList());
    }



//    @GetMapping
//    public List<Car> getAll() {
//        return carRepository.findAll();
//    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carRepository.save(car);
    }

}

