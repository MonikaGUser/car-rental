package pl.sdacademy.javaktw9.carRental.model;

import pl.sdacademy.javaktw9.carRental.model.Car;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "`city`")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;
    private String name;

    public City(){

    }

    public City(String name) {
        this.name = name;
    }

    public Long getCityId() {
        return cityId;
    }

    public String getName() {
        return name;
    }

}
