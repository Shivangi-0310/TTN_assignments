package com.demo;

public class Tea implements HotDrink {

    @Override
    public void prepareDrink() {
        System.out.println("preparing tea");
    }
}
