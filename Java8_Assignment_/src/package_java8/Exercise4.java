package package_java8;

//4. Create an Employee Class with instance variables
// (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference

interface Perform{
    Employee emp(int id, String name, String city);
}

class Employee{
    int eId;
    String eName;
    String eCity;

    public Employee(int eId, String eName, String eCity) {
        this.eId = eId;
        this.eName = eName;
        this.eCity = eCity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eCity='" + eCity + '\'' +
                '}';
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Perform perform= Employee::new;
        System.out.println("Employee Details: "+perform.emp(10,"Aakash", "Delhi"));
    }
}
