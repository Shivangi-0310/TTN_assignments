package com.demo;

public class Restaurant {
    HotDrink hotDrink;

    public Restaurant() {
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    @Override
    public String toString() {
        return "com.demo.Restaurant{" +
                "hotDrink=" + hotDrink +
                '}';
    }
}
