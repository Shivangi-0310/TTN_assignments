package Java1;

abstract class Bank {
    int no_of_branches;
    double rate;

    abstract void getDetails();

}

class SBI extends Bank {
    SBI() {
        no_of_branches = 10;
        rate = 12.2;
    }

    @Override
    void getDetails() {
        System.out.println("SBI no of branches: " + no_of_branches);
        System.out.println("rate : " + rate);
    }
}

class BOI extends Bank {
    BOI() {
        no_of_branches = 18;
        rate = 10.6;
    }

    @Override
    void getDetails() {
        System.out.println("BOI no of branches: " + no_of_branches);
        System.out.println("rate : " + rate);

    }
}

class ICICI extends Bank {
    ICICI() {
        no_of_branches = 35;
        rate = 2.9;
    }

    @Override
    void getDetails() {
        System.out.println("ICICI no of branches: " + no_of_branches);
        System.out.println("rate: " + rate);

    }

}

public class Bank_details {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.getDetails();
        BOI b = new BOI();
        b.getDetails();
        ICICI i = new ICICI();
        i.getDetails();

    }

}