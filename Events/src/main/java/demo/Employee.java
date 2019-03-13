package demo;

// Question 1. Invoke context events start(), stop() and close().
public class Employee {
    int id;
    String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void printEmployeeDetails()
    {
        System.out.println(getName()+" "+ getId());
    }

    @Override
    public String toString() {
        return "demo.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
