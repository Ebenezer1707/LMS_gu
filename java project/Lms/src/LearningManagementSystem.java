/*Contains methods to add courses, add students, enroll students in courses, and list
enrolled students for a course*/

//Stores students and courses in lists.


import java.sql.*;

public class LearningManagementSystem {

    public void addCourse(String courseId, String courseName) {
        String sql = "INSERT INTO courses (course_id, course_name) VALUES (?, ?)";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, courseId);
            stmt.setString(2, courseName);
            stmt.executeUpdate();
            System.out.println("Course added.");
        } catch (SQLException e) {
        }
    }

    public void addStudent(String studentId, String name) {
        String sql = "INSERT INTO students (student_id, name) VALUES (?, ?)";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, studentId);
            stmt.setString(2, name);
            stmt.executeUpdate();
            System.out.println("Student added.");
        } catch (SQLException e) {
        }
    }

    public void enrollStudentInCourse(String studentId, String courseId) {
        String sql = "INSERT INTO enrollments (student_id, course_id) VALUES ((SELECT id FROM students WHERE student_id = ?), (SELECT id FROM courses WHERE course_id = ?))";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, studentId);
            stmt.setString(2, courseId);
            stmt.executeUpdate();
            System.out.println("Student enrolled in course.");
        } catch (SQLException e) {
        }
    }

    public void listEnrolledStudents(String courseId) {
        String sql = "SELECT s.name FROM students s JOIN enrollments e ON s.id = e.student_id JOIN courses c ON e.course_id = c.id WHERE c.course_id = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, courseId);
            ResultSet rs = stmt.executeQuery();
            System.out.println("Students enrolled in course ID " + courseId + ":");
            while (rs.next()) {
                System.out.println(" - " + rs.getString("name"));
            }
        } catch (SQLException e) {
        }
    }
}
