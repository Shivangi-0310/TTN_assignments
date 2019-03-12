package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
      @Autowired
    public HotDrinks hotDrinks;

    public Restaurant(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public Restaurant() {
    }

    public HotDrinks getHotDrinks() {
        return hotDrinks;
    }
     @Required
    public void setHotDrinks(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }


}
