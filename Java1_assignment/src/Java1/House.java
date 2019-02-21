package Java1;

public enum House {
    BUNGLOW(9100000), FLAT(5000000), DOUBLE_STOREY(6000000);
    int house_price;


    House(int price) {
        this.house_price = price;
    }

    int getPrice() {
        return house_price;
    }

    public static void main(String[] args) {
        for (House h :  House.values()) {
            System.out.println("Type of house: " + h + " and price is: " + h.getPrice());
        }
    }
}

