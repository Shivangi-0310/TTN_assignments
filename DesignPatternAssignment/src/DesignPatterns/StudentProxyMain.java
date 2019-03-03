package DesignPatterns;

interface StudentRecordAccess{
    void accessRecord();
}

class StudentDetails{
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentCollegeName;

    public StudentDetails(int studentId, String studentName, int studentAge, String studentCollegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentCollegeName = studentCollegeName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentCollegeName() {
        return studentCollegeName;
    }

    public void setStudentCollegeName(String studentCollegeName) {
        this.studentCollegeName = studentCollegeName;
    }

    @Override
    public String toString() {
        return "DesignPatterns.StudentDetails{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentCollegeName='" + studentCollegeName + '\'' +
                '}';
    }
}

class Record implements StudentRecordAccess{
    StudentDetails studentDetails;
    public Record(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    @Override
    public void accessRecord() {
        System.out.println("Accessing records of students :: ");
        System.out.println(studentDetails);
    }
    
}

class RecordProxy extends Record {
    private boolean isAdmin = false;
    private String userName;
    private String password;

    public RecordProxy(StudentDetails studentDetails, String userName, String password) {
        super(studentDetails);
       this.userName=userName;
       this.password=password;

        if ("Shivangi".equals(userName) && "shivi10".equals(password))
            isAdmin = true;
    }

    @Override
    public void accessRecord() {
        if (isAdmin)
            super.accessRecord();
        else
            System.out.println("Cannot access the records");
    }
}

public class StudentProxyMain {
    public static void main(String[] args) {
       StudentDetails studentDetails = new StudentDetails(101,"Shivangi",23,"LBSIM");
        StudentRecordAccess studentRecordAccess = new RecordProxy(studentDetails, "Shivangi", "shivi10");
        studentRecordAccess.accessRecord();
        StudentDetails studentDetails1 = new StudentDetails(101,"Shivangi",23,"LBSIM");
        StudentRecordAccess studentRecordAccess1 = new RecordProxy(studentDetails1, "Shivi", "shivi10");
        studentRecordAccess1.accessRecord();
    }
}
