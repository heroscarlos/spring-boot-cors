package com.example.restservice;

public class Car { 

    private String year;

    private String name;

    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Car(String year, String name) {
        this.year = year;
        this.name = name;
    }

    
}
