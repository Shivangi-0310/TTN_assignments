package Java2;

//  5. WAP to show object cloning in java using cloneable and copy constructor both.

public class CopyConstructor {
    int studentId;
    String studentName;
    int studentAge;

    public CopyConstructor(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public CopyConstructor(CopyConstructor c) {
        this.studentId = c.studentId;
        this.studentName = c.studentName;
        this.studentAge = c.studentAge;

    }

    public String toString() {
        return "Id: " + studentId + ", Name: " + studentName + ", Age:  " + studentAge;
    }

    public static void main(String[] args) {
        CopyConstructor copyConstructor1 = new CopyConstructor(10, "Aakash", 23);
        System.out.println(copyConstructor1.toString());
        CopyConstructor copyConstructor2 = new CopyConstructor(copyConstructor1);
        System.out.println(copyConstructor2);

    }
}

