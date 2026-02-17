package student.management.system;

// Represents a course
public class Subject {

    private String courseName; // Encapsulation
    private String courseCode;

    public Subject(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }

    // Display course info
    public void displayCourse() {
        System.out.println("Course: " + courseName + " | Code: " + courseCode);
    }
}

