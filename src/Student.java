//Design the Student class. • The attributes are a student ID,
// a first name, a last name, a date of birth, and a list containing the
// grades obtained by the student. • Write a constructor for this class that
// takes all the attributes and another constructor that initializes the grades
// list as empty, along with getters and setters for all attributes.
// • The class will also have the following methods:
// ▪ calculateGradeAverage(), which calculates the student's grade average.
// ▪ isExcellent(), which returns true if the student's grade average is greater
// than or equal to 28.

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private  String firstName;
    private  String lastName;
    private String dateOfBirth;
    private ArrayList<Double> grades;

    public Student(int studentID, String firstName,String lastName, String dateOfBirth,ArrayList<Double> grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;
    }

    public Student(int studentID, String firstName, String lastName, String dateOfBirth) {
        this(studentID, firstName, lastName, dateOfBirth, new ArrayList<>());
//        this.studentID=studentID;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.dateOfBirth=dateOfBirth;
//        grades = new ArrayList<>();

    }



    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public  String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double calculateGradeAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean isExcellent() {
        return calculateGradeAverage() >= 28;
    }


}
