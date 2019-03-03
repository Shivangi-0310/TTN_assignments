package DesignPatterns;

interface Toppings {
    String decorateWithToppings();
}

class Pizza implements Toppings {
    String size;
    String base;
    String sauce;

    public Pizza(String size, String base, String sauce) {
        this.size = size;
        this.base = base;
        this.sauce = sauce;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "DesignPatterns.Pizza{" +
                "size='" + size + '\'' +
                ", base='" + base + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }


    @Override
    public String decorateWithToppings() {
        return "This pizza is of size :: " + size + " base :: " + base + " and sauce used :: " + sauce;
    }
}

class CheeseToppings implements Toppings{
    Toppings toppings;
    String cheeseType;

    public CheeseToppings(Toppings toppings, String cheeseType) {
        this.toppings = toppings;
        this.cheeseType = cheeseType;
    }

    public Toppings getToppings() {
        return toppings;
    }

    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+" \n"+"topping with ::"+cheeseType;
    }
}

class OliveToppings implements Toppings{
    Toppings toppings;

    public OliveToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+"\n"+" DesignPatterns.Toppings with olive";
    }

}

class CapsicumToppings implements Toppings {
    Toppings toppings;

    public CapsicumToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+"\n"+" DesignPatterns.Toppings with Capsicum";
    }

}

class OnionToppings implements Toppings{
    Toppings toppings;

    public OnionToppings(Toppings toppings) {
        this.toppings = toppings;
    }

    @Override
    public String decorateWithToppings() {
        return toppings.decorateWithToppings()+"\n"+" DesignPatterns.Toppings with onion";
    }
}

public class PizzaDecoratorMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Medium", "Pan", " schezwan");
        System.out.println( pizza.decorateWithToppings());
        CheeseToppings cheeseToppings=new CheeseToppings(new Pizza("Large","Pan","Red Chilly"),"Cheddar");
        System.out.println(cheeseToppings.decorateWithToppings());
        OliveToppings oliveToppings = new OliveToppings(new CheeseToppings(new Pizza("small","cheese burst","mixed"),"cheddar"));
        System.out.println(oliveToppings.decorateWithToppings());
    }
}
