//Finally, write a Main class in which we will test our code. In the main method, the following should be done: • Create 4 students and 2 professors using the different constructors.
// • Test the assignGrade() method with input parameters of your choice.
// • Put the students in an array and do the same for the professors.
// • Print the first names and last names of all excellent students.
// • Print the first name and last name of the student with the highest grade average.


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student st = new Student(21, "Mudid", "Mawuwa", "2022");
        Student st1 = new Student(12, "Melissa", "Feza", "2021");
        Student st2 = new Student(23, "Hanna", "Debay", "2020");

        Professor pr = new Professor(02, "Munde", "Daniel", "Java");
        Professor pr1 = new Professor(23, "Dawood", "Muhamed", "Advanced Java");
        Professor pr2 = new Professor(24, "Jack", "Qjack", "SQL");

        ;


                Professor.assignGrade(st, 30);
                Professor.assignGrade(st1, 17);
                Professor.assignGrade(st2, 60);

                Student[] students = {st, st1, st2 };

                Professor[] professors = {pr, pr1, pr2 };

                System.out.println("Excellent Students:");
                for (Student student : students) {
                    if (student.isExcellent()) {
                        System.out.println(student.getFirstName() + " " + student.getLastName());
                    }
                }

                Student topStudent = students[0];
                for (Student student : students) {
                    if (student.calculateGradeAverage() > topStudent.calculateGradeAverage()) {
                        topStudent = student;
                    }
                }
                System.out.println("\nStudent with the highest grade average:");
                System.out.println(topStudent.getFirstName() + " " + topStudent.getLastName());
            }
        }






