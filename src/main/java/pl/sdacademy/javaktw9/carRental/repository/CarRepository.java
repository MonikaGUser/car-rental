package pl.sdacademy.javaktw9.carRental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sdacademy.javaktw9.carRental.model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
}
