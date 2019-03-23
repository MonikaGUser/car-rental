package pl.sdacademy.javaktw9.carRental;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cars")
public class CarController {

        private CarRepository carController;

        public CarController(CarRepository carRepository) {
            this.carController = carRepository;
        }

        @GetMapping
        public List<Car> getAll() {
            return carController.findAll();
        }

        @PostMapping
        public Car create(@RequestBody Car car) {
            return carController.save(car);
        }

}
