package student.management.system;

// Student inherits from Individual
public class Student extends Individual {

    private String studentId;    // Encapsulation
    private double marks;
    private Subject course;      // Composition

    public Student(String studentId, String fullName, Subject course, double marks) {
        super(fullName);
        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public double getMarks() {
        return marks;
    }

    public Subject getCourse() {
        return course;
    }

    // Student grade based on marks
    public String showRemarks() {
        if (marks < 0 || marks > 100) {
            return "Invalid marks";
        } else if (marks >= 80) {
            return "Excellent";
        } else if (marks >= 60) {
            return "Good";
        } else if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Polymorphism: override abstract method
    @Override
    public void showProfile() {
        System.out.println("\n--- Student Profile ---");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + getFullName());
        course.displayCourse();
        System.out.println("Marks      : " + marks);
        System.out.println("Remarks    : " + showRemarks());
    }
}

