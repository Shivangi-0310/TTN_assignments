package Java2;

// 5. WAP to show object cloning in java using cloneable and copy constructor both.

public class CloneObject implements Cloneable {
    int studentId;
    String studentName;
    int studentAge;

    public CloneObject(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString() {
        return "Id: " + studentId + ", Name: " + studentName + ", Age:  " + studentAge;
    }

    public static void main(String[] args) {
        CloneObject cloneObject1 = new CloneObject(10, "Aakash", 23);
        System.out.println(cloneObject1);
        System.out.println("Cloning object:");
        try {
            CloneObject cloneObject2 = (CloneObject) cloneObject1.clone();
            System.out.println(cloneObject2);
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }
    }
}
