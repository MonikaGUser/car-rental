package pl.sdacademy.javaktw9.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.javaktw9.carRental.model.City;

public interface CityRepository extends JpaRepository<City, Long> {
}
