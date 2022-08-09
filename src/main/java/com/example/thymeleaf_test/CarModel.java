package com.example.thymeleaf_test;


public class CarModel {

    private String model;
    private String mark;

    public CarModel() {
    }

    public CarModel(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
