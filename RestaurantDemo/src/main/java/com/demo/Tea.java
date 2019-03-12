package com.demo;

public class Tea implements HotDrink {

//    public Tea() {
//    }


    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing tea");
    }
}
