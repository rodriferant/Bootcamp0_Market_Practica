package com.sales.market.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Employee extends ModelBase{


    private String firstName;
    private String lastName;
    private Byte[] image;

    //@OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    // por defecto en fields es EAGER y en collecciones es LAZY  ytodo valor booleano es true
    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REMOVE})
    // mapped by employee es el nombre de la variable en Contrato copprespondiente a el field Employee

    private List<Contract> contracts;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

}
