package com.carshow.carstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long year;
    private String make;
    private String model;

    //Typically you don't need to provide because Java provides by default. Uses this to create a new instance via persistence framework.
    private Car(){}
    //@entity needs a no arg constructor
    private void setMake(String make){
        this.make = make;
    }
    private String getMake(){
        return make;
    }
    private void setModel(String model){
        this.model = model;
    }
    private String getlastName(){
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
