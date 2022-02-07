package com.fancv.api;

import java.io.Serializable;
import java.util.List;

/**
 * return car info
 */
public class CarDTO implements Serializable {


    private static final long serialVersionUID = -1978296715411598837L;

    String name;

    Integer lenght;

    String price;

    List<String> users;

    public CarDTO(String name, Integer lenght, String price) {
        this.name = name;
        this.lenght = lenght;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
