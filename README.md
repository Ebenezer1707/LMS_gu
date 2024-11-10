
Learning Management System (LMS)
A simple Java-based Learning Management System application with functionalities to manage courses, students, and enrollments. This project uses JDBC for database operations and is structured with separate files for database utilities, data access objects (DAOs), and the main application.

Features
Course Management: Add courses to the system.
Student Management: Register students in the system.
Enrollments: Enroll students in specific courses.
Listing Enrollments: View all students enrolled in a specific course.

Project Structure
DatabaseUtil.java: Handles database connection setup.
LMSDao.java: Contains methods for adding courses, registering students, enrolling students in courses, and listing enrollments.
Main.java: The main application file demonstrating usage of LMSDao.

Requirements
Java 8+
MySQL (or compatible database)
