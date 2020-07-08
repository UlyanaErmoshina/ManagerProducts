package ru.netology.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    public Smartphone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Smartphone() {
    }

    @Override
    public boolean matches(String search) {
        return super.matches(search) || manufacturer.equalsIgnoreCase(search);

    }
}




