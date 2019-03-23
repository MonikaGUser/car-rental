package pl.sdacademy.javaktw9.carRental;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "`car`")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date productionDate;
    private Long price;
    private String location;
    private Status status;

    public Car() {
    }

    public Car(String name, Date productionDate, Long price, String location, Status status) {
        this.name = name;
        this.productionDate = productionDate;
        this.price = price;
        this.location = location;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Long getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }

    public Status getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }
}
