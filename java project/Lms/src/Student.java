//Represents a student with an ID, name, and a list of enrolled students.
//Provides methods to enroll in courses

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String studentId;
    private final String name;
    private final List<Course> enrolledCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }
}
