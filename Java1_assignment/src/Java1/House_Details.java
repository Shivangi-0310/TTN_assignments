package Java1;

public class House_Details {
    public static void main(String[] args) {

        House[] house  = House.values();
        for(House h: house) {
            System.out.println("Type of house: "+h.toString()+ " and price is: "+h.getPrice());
        }
    }
}
