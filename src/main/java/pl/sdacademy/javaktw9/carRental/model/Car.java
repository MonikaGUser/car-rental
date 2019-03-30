package pl.sdacademy.javaktw9.carRental.model;
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
    private boolean status;
    private Long userId;

    public Car() {
    }



    public Car(String name, Date productionDate, Long price, String location, boolean status, Long userId) {
        this.name = name;
        this.productionDate = productionDate;
        this.price = price;
        this.location = location;
        this.status = status;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productionDate=" + productionDate +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", status=" + status +
                ", userId=" + userId +
                '}';
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

    public boolean getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }
}
