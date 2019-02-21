package Java2;
//Q13. Create a custom exception that do not have any stack trace.

class BalanceNotSufficientException extends Exception {
    BalanceNotSufficientException(String s) {
        super(s);
    }

    public void printStackTrace() {
        System.out.println("No stack trace");
    }
}
class CustomerBankDetails{
    String customerName;
    int accountNumber;
    int accountBalance;

    public CustomerBankDetails(String customerName, int accountNumber, int accountBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    static void checkBalance(int balance) throws BalanceNotSufficientException  {
        if(balance<5000)
        {
            throw new BalanceNotSufficientException("Balance is insufficient.Please deposit the money.");
        }
        else
            System.out.println("Balance is sufficient");

    }
}


public class CustomException {
    public static void main(String[] args) {
        CustomerBankDetails customerBankDetails= new CustomerBankDetails("Shivi", 201625524, 4000);
        try {
            CustomerBankDetails.checkBalance(customerBankDetails.accountBalance);
        }
        catch (BalanceNotSufficientException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
