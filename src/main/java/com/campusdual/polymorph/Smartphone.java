package com.campusdual.polymorph;

import com.campusdual.interfaces.IBooking;

import java.util.Date;

public class Smartphone extends Device implements Ichargeable {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void makeACall(){
        System.out.println("Making a cal");
    }


    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " is charging at 15 W ");
    }

    @Override
    public void use() {
        System.out.println("Using with touch screen");

    }
}
