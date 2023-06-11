package com.eshop.dto;

import com.eshop.entity.Computer;

public class ComputerDTO {
    private String brand;
    private String color;
    private Integer ram;

    public ComputerDTO(String brand, String color, Integer ram) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
    }
    public ComputerDTO(Computer c) {
        this.brand = c.getBrand();
        this.color =c.getColor();
        this.ram = c.getRam();
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
