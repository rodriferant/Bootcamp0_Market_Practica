package com.sales.market.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Position extends ModelBase{


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
