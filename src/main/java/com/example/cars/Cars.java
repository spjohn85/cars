package com.example.cars;

import javax.persistence.Entity;

@Entity
public class Cars {

    private String type;
    private String name;

    public Cars() {

    }

    public Cars(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
