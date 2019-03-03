package DesignPatterns;// DesignPatterns.Student POJO class

class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentCollegeName;
    private String studentCourseName;
    private Boolean hasDoneInternship;
    private int studentScore;

    Student(StudentBuilder studentBuilder) {
        studentId = studentBuilder.getStudentId();
        studentName = studentBuilder.getStudentName();
        studentAge = studentBuilder.getStudentAge();
        studentCollegeName = studentBuilder.getStudentCollegeName();
        studentCourseName = studentBuilder.getStudentCourseName();
        hasDoneInternship = studentBuilder.getHasDoneInternship();
        studentScore = studentBuilder.getStudentScore();
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

    public String getStudentCourseName() {
        return studentCourseName;
    }

    public void setStudentCourseName(String studentCourseName) {
        this.studentCourseName = studentCourseName;
    }

    public Boolean getHasDoneInternship() {
        return hasDoneInternship;
    }

    public void setHasDoneInternship(Boolean hasDoneInternship) {
        this.hasDoneInternship = hasDoneInternship;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "DesignPatterns.Student details are :: \n" +
                "studentId= " + studentId + "\n" +
                "studentName= " + studentName + "\n" +
                "studentAge= " + studentAge + "\n" +
                "studentCollegeName= " + studentCollegeName + "\n" +
                "studentCourseName= " + studentCourseName + "\n" +
                "hasDoneInternship= " + hasDoneInternship + "\n" +
                "studentScore= " + studentScore;
    }
}

class StudentBuilder {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentCollegeName;
    private String studentCourseName;
    private Boolean hasDoneInternship;
    private int studentScore;

    public StudentBuilder(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public StudentBuilder setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public StudentBuilder setStudentAge(int studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public String getStudentCollegeName() {
        return studentCollegeName;
    }

    public StudentBuilder setStudentCollegeName(String studentCollegeName) {
        this.studentCollegeName = studentCollegeName;
        return this;
    }

    public String getStudentCourseName() {
        return studentCourseName;

    }

    public StudentBuilder setStudentCourseName(String studentCourseName) {
        this.studentCourseName = studentCourseName;
        return this;
    }

    public Boolean getHasDoneInternship() {
        return hasDoneInternship;
    }

    public StudentBuilder setHasDoneInternship(Boolean hasDoneInternship) {
        this.hasDoneInternship = hasDoneInternship;
        return this;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public StudentBuilder setStudentScore(int studentScore) {
        this.studentScore = studentScore;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

}

public class StudentBuilderMain {
    public static void main(String[] args) {
        Student student = new StudentBuilder(101, "Aakash", 23)
                .setStudentCollegeName("IITG")
                .setStudentCourseName("M.Tech (BT)")
                .setHasDoneInternship(true)
                .setStudentScore(98)
                .build();
        System.out.println(student);


    }
}
