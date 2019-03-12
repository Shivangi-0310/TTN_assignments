package demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {
    List<String> studentName;
    Set<Integer> studentMarks;
    Map<Integer, String> subjectWithCode;

    public Complex() {
    }

    public Complex(List<String> studentName, Set<Integer> studentMarks, Map<Integer, String> subjectWithCode) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
        this.subjectWithCode = subjectWithCode;
    }

    public List<String> getStudentName() {
        return studentName;
    }

    public void setStudentName(List<String> studentName) {
        this.studentName = studentName;
    }

    public Set<Integer> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Set<Integer> studentMarks) {
        this.studentMarks = studentMarks;
    }

    public Map<Integer, String> getSubjectWithCode() {
        return subjectWithCode;
    }

    public void setSubjectWithCode(Map<Integer, String> subjectWithCode) {
        this.subjectWithCode = subjectWithCode;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "studentName=" + studentName +
                ", studentMarks=" + studentMarks +
                ", subjectWithCode=" + subjectWithCode +
                '}';
    }
}
