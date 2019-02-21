package Java2;
// Question 10
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;

abstract class Actor {
    String name;
    Long phoneNumber;
    String emailId;
    String role;

    public Actor() {
    }

    public Actor(String name, Long phoneNumber, String emailId, String role) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.role = role;
    }


}

class Order {
    String orderId;
    String orderDescription;
    float price;

    public Order() {
    }

    static Queue<String> newOrderId = new PriorityQueue<>();
    static Queue<String> completedOrderId = new PriorityQueue<>();

    public Order(String orderId, String orderDescription, float price) {
        this.orderId = orderId;
        this.orderDescription = orderDescription;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

}

class Cashier extends Actor {

    static String role = "cashier";
    String cashierId;
    Date dateofJoining;

    public Cashier(String name, Long phoneNumber, String emailId, String role, String cashierId, Date dateofJoining) {
        super(name, phoneNumber, emailId, Cashier.role);
        this.cashierId = cashierId;
        this.dateofJoining = dateofJoining;
    }

    public String receivePayandGiveToken() {

        String orderId = "";
        String orderDescription = "";
        float price = 0.0f;
        boolean paymentReceived = true;
        Order order = new Order(orderId, orderDescription, price);

        if (paymentReceived) {
            addToQueue(orderId);
            return order.getOrderId();

        }

        return "";
    }

    private void addToQueue(String orderID) {
        Order.newOrderId.add(orderID);
    }

}
class Barista extends Actor {

    static String role = "barista";

    public Barista() {
    }

    public Barista(String name, Long phoneNumber, String emailId, String role) {
        super(name, phoneNumber, emailId, Barista.role);
    }

    public void orderPreparation() {
        String orderID = Order.newOrderId.remove();

        Order order = new Order();

        if (order.getOrderId() == orderID)
            order.getOrderDescription();
        boolean prepareOrder = true;
        if (prepareOrder) {
            notification(orderID);
            addCompleteOrder(orderID);
        }
    }

    public void notification(String orderID) {
        System.out.println("Notification on screen : " + orderID);

    }

    private void addCompleteOrder(String orderID) {
        Order.completedOrderId.add(orderID);
    }

}


class Customer extends Actor {

    String customerId;

    public Customer() {
    }

    public Customer(String name, Long phoneNumber, String emailId, String role, String customerId, Cashier cashier) {
        super(name, phoneNumber, emailId, role);
        this.customerId = customerId;
        this.cashier = cashier;
    }

    Cashier cashier;
    public String order() {
        return cashier.receivePayandGiveToken();
    }

    public void collectCoffee(String token)
    {
        String notification="";
        if(notification.equals(token));
        System.out.println("Please collect your order");
    }

}

public class Coffee {
    public static void main(String[] args) {

        Customer customer = new Customer();
        String tokenNumber= customer.order();
        customer.collectCoffee(tokenNumber);

    }
}
