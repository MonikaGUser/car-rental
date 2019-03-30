package pl.sdacademy.javaktw9.carRental.controller;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.javaktw9.carRental.repository.CityRepository;
import pl.sdacademy.javaktw9.carRental.model.City;

import java.util.List;
@RestController
@RequestMapping("/city")
public class CityController {
    private CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @PostMapping
    public City create(@RequestBody City city) {
        return cityRepository.save(city);
    }
}