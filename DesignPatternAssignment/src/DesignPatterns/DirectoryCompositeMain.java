package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

interface EmployeeDirectory {
    void showDirectoryDetails();
}

class JavaEmployeeDirectory implements EmployeeDirectory {
    int employeeId;
    String EmployeeName;
    String currentProject;

    public JavaEmployeeDirectory(int employeeId, String employeeName, String currentProject) {
        this.employeeId = employeeId;
        EmployeeName = employeeName;
        this.currentProject = currentProject;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    @Override
    public String toString() {
        return "JavaEmployeeDirectory{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", currentProject='" + currentProject + '\'' +
                '}';
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("JavaEmployeeDirectory{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", currentProject='" + currentProject + '\'' +
                '}');

    }
}

class QAEmployeeDirectory implements EmployeeDirectory {
    int employeeId;
    String EmployeeName;
    String currentProject;

    public QAEmployeeDirectory(int employeeId, String employeeName, String currentProject) {
        this.employeeId = employeeId;
        EmployeeName = employeeName;
        this.currentProject = currentProject;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    @Override
    public String toString() {
        return "QAEmployeeDetails{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", currentProject='" + currentProject + '\'' +
                '}';
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("QAEmployeeDetails{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", currentProject='" + currentProject + '\'' +
                '}');

    }
}

class ManagementEmployeeDirectory implements EmployeeDirectory {
    int employeeId;
    String EmployeeName;
    String designation;

    public ManagementEmployeeDirectory(int employeeId, String employeeName, String designation) {
        this.employeeId = employeeId;
        EmployeeName = employeeName;
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "ManagementEmployeeDetails{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("ManagementEmployeeDetails{" +
                "employeeId=" + employeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", designation='" + designation + '\'' +
                '}');

    }
}

class JavaDirectory implements EmployeeDirectory {
    List<EmployeeDirectory> javaDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("\n Java developer Directory>>>>>>>>>>");
        javaDirectory.forEach(e -> e.showDirectoryDetails());

    }
}

class QADirectory implements EmployeeDirectory {
    List<EmployeeDirectory> qaDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("\n QA Directory>>>>>>>>>");
        qaDirectory.forEach(e -> e.showDirectoryDetails());


    }
}

class ManagementDirectory implements EmployeeDirectory {
    List<EmployeeDirectory> managementDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("\n Management Directory>>>>>>>>>");
        managementDirectory.forEach(e -> e.showDirectoryDetails());
    }
}

class CompanyDirectory implements EmployeeDirectory {

    List<EmployeeDirectory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e -> e.showDirectoryDetails());
    }
}

public class DirectoryCompositeMain {
    public static void main(String[] args) {
        JavaEmployeeDirectory javaEmployeeDirectory1 =
                new JavaEmployeeDirectory(101, "Aakash Sharma", "Tata Sky");
        JavaEmployeeDirectory javaEmployeeDirectory2 =
                new JavaEmployeeDirectory(102, "Samayra", "HDFC");
        QAEmployeeDirectory qaEmployeeDirectory1 =
                new QAEmployeeDirectory(201, "Sam", "REAP");
        QAEmployeeDirectory qaEmployeeDirectory2 =
                new QAEmployeeDirectory(202, "John", "Link Sharing");
        ManagementEmployeeDirectory managementEmployeeDirectory1=
                new ManagementEmployeeDirectory(301,"Kiran","Senior HR");
        ManagementEmployeeDirectory managementEmployeeDirectory2=
                new ManagementEmployeeDirectory(302,"Sakshi","Assistant Manager");
        JavaDirectory javaDirectory= new JavaDirectory();
        javaDirectory.javaDirectory.add(javaEmployeeDirectory1);
        javaDirectory.javaDirectory.add(javaEmployeeDirectory2);
        QADirectory qaDirectory= new QADirectory();
        qaDirectory.qaDirectory.add(qaEmployeeDirectory1);
        qaDirectory.qaDirectory.add(qaEmployeeDirectory2);
        ManagementDirectory managementDirectory= new ManagementDirectory();
        managementDirectory.managementDirectory.add(managementEmployeeDirectory1);
        managementDirectory.managementDirectory.add(managementEmployeeDirectory2);
        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.companyDirectory.add(javaDirectory);
        companyDirectory.companyDirectory.add(qaDirectory);
        companyDirectory.companyDirectory.add(managementDirectory);
        companyDirectory.showDirectoryDetails();



    }
}
