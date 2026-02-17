package student.management.system;

import java.util.Scanner;

public class SystemLauncher {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Student Management System!");

        // Capture student info
        System.out.print("Enter Student ID: ");
        String studentId = userInput.nextLine();

        System.out.print("Enter Full Name: ");
        String fullName = userInput.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = userInput.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = userInput.nextLine();

        System.out.print("Enter Marks: ");
        double marks = userInput.nextDouble();

        // Create objects Subject and Student
        Subject course = new Subject(courseName, courseCode);
        Student student = new Student(studentId, fullName, course, marks);

        // Display student profile
        student.showProfile();

        userInput.close();
    }
}

