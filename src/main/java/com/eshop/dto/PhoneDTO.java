package com.eshop.dto;

import com.eshop.entity.Phone;

public class PhoneDTO {
    private String brand;
    private String color;
   private  Integer ram;

    public PhoneDTO(String brand, String color, Integer ram) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
    }

    public PhoneDTO(Phone phone) {
        this.brand = phone.getBrand();
        this.color = phone.getColor();
        this.ram = phone.getRam();
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

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }
}
