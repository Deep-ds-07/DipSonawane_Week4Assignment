package week4_Q1;

import java.util.ArrayList;

public class StudentManagment {
    private ArrayList<Students> studentList = new ArrayList<>();

    public void addStudent(String name, int rollNumber) {
        Students student = new Students(name, rollNumber);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        Students studentToRemove = findStudent(rollNumber);
        if (studentToRemove != null) {
            studentList.remove(studentToRemove);
            System.out.println("Student removed successfully.");
        } else {
            System.err.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public void searchStudent(int rollNumber) {
        Students student = findStudent(rollNumber);
        if (student != null) {
            System.out.println("Your Student found: " + student);
        } else {
            System.err.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public void updateStudent(int rollNumber, String newName, int newRollNumber) {
        Students student = findStudent(rollNumber);
        if (student != null) {
            student.setName(newName);
            student.setRollNumber(newRollNumber);
            System.out.println("Student Details updated successfully.");
            displayStudent(newRollNumber); // Display updated student details
        } else {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    public boolean studentExists(int rollNumber) {
        return findStudent(rollNumber) != null;
    }

    public int getTotalStudents() {
        return studentList.size();
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display In this List.");
        } else {
            System.out.println("+------------+--------------------+");
            System.out.println("| Roll Number| Name               |");
            System.out.println("+------------+--------------------+");

            for (Students student : studentList) {
                System.out.println(student);
            }

            System.out.println("+------------+--------------------+");
        }
    }

    private Students findStudent(int rollNumber) {
        for (Students student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    private void displayStudent(int rollNumber) {
        Students student = findStudent(rollNumber);
        if (student != null) {
            System.out.println("+------------+--------------------+");
            System.out.println("| Roll Number| Name               |");
            System.out.println("+------------+--------------------+");
            System.out.println(student);
            System.out.println("+------------+--------------------+");
        } else {
            System.err.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }
}
