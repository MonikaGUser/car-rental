package pl.sdacademy.javaktw9.carRental.model;

import javax.persistence.*;

@Entity
@Table(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String surname;
    private String street;
    private int streetNumber;
    private String city;
    private String email;
    private String password;

public User (){}
    public User(String name, String surname, String street, int streetNumber, String city, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Long getUserId() {
        return userId;
    }
}
