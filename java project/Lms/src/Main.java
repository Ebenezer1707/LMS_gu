public class Main {
    public static void main(String[] args) {
        LMSDao lmsDao = new LMSDao();

        // Example operations
        lmsDao.addCourse("C101", "Introduction to Programming");
        lmsDao.addStudent("S101", "Alice");
        lmsDao.enrollStudentInCourse("S101", "C101");
        lmsDao.listEnrolledStudents("C101");
    }
}
